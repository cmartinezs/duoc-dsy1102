package cl.duoc.cmartinez.model.dao;

import cl.duoc.cmartinez.model.UserModel;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cmartinezs
 */
public class UserDAO extends GenericDAO {
    private final String tableName = "user";
    private final Map<String, Boolean> columns;

    public UserDAO(Connection connection) {
        super(connection);
        columns = new HashMap<>();
        columns.put("id", true);
        columns.put("username", true);
        columns.put("password", true);
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public Map<String, Boolean> getColumns() {
        return columns;
    }

    @Override
    public String getPrimaryKey() {
        return "id";
    }

    public UserModel findByUsername(String username) {
        Map<String, Object> row = selectByColumn("username", username);
        if (row.isEmpty()) {
            return null;
        }
        return new UserModel(row);
    }
    
}
