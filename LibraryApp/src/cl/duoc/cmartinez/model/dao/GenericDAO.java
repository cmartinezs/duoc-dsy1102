package cl.duoc.cmartinez.model.dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cmartinezs
 */
public abstract class GenericDAO {
    private final Connection connection;

    public GenericDAO(Connection connection) {
        this.connection = connection;
    }

    public abstract String getTableName();

    public abstract Map<String, Boolean> getColumns();

    public abstract String getPrimaryKey();

    private List<String> requiredColumns() {
        List<String> columns = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getColumns().entrySet()) {
            if (entry.getValue()) {
                columns.add(entry.getKey());
            }
        }
        return columns;
    }

    private Map<String, Object> mapRow(ResultSet rs) throws SQLException {
        Map<String, Object> row = new HashMap<>();
        for (String column : getColumns().keySet()) {
            row.put(column, rs.getObject(column));
        }
        return row;
    }

    public List<Map<String, Object>> selectAll() {
        List<Map<String, Object>> rows = new ArrayList<>();
        String sql = String.format("SELECT * FROM %s", getTableName());
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                rows.add(mapRow(rs));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rows;
    }

    public Map<String, Object> selectById(int id) {
        return selectByColumn(getPrimaryKey(), id);
    }

    public Map<String, Object> selectByColumn(String column, Object value) {
        String sql = String.format("SELECT * FROM %s WHERE %s = ?", getTableName(), column);
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setObject(1, value);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return mapRow(rs);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Collections.emptyMap();
    }

    public boolean insert(Map<String, Object> values) throws SQLException {
        List<String> columns = new ArrayList<>();
        List<String> placeholders = new ArrayList<>();
        List<Object> params = new ArrayList<>();
        List<String> requiredColumns = requiredColumns();

        // Check if all required columns are present
        List<String> missingColumns = new ArrayList<>(requiredColumns);
        missingColumns.removeAll(values.keySet());
        if (!missingColumns.isEmpty()) {
            throw new IllegalArgumentException("Missing required columns: " + missingColumns);
        }

        // Check if there are columns that do not belong to the table
        List<String> invalidColumns = new ArrayList<>(values.keySet());
        invalidColumns.removeAll(getColumns().keySet());
        if (!invalidColumns.isEmpty()) {
            throw new IllegalArgumentException("Invalid columns: " + invalidColumns);
        }

        // Build the SQL query
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            columns.add(entry.getKey());
            placeholders.add("?");
            params.add(entry.getValue());
        }

        String sql = String.format("INSERT INTO %s (%s) VALUES (%s)",
                getTableName(),
                String.join(", ", columns),
                String.join(", ", placeholders));
        
        PreparedStatement statement = connection.prepareStatement(sql);

        try {
            for (int i = 0; i < params.size(); i++) {
                statement.setObject(i + 1, params.get(i));
            }
            return statement.executeUpdate() > 0;
        } finally {
            if(statement != null) {
                statement.close();
            }
        }
    }
}
