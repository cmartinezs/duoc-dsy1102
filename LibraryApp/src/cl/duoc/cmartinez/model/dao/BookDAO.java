package cl.duoc.cmartinez.model.dao;

import cl.duoc.cmartinez.model.BookModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cmartinezs
 */
public class BookDAO {
    private final Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<BookModel> findAll() throws SQLException {
        List<BookModel> rows = new ArrayList<>();
        Statement statement = connection.createStatement();
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM books");
            while (rs.next()) {
                BookModel book = new BookModel(
                        rs.getInt("id"),
                        rs.getString("isbn"),
                        rs.getString("author"),
                        rs.getString("title")
                );
                book.setPrice(rs.getDouble("price"));
                book.setPublication(rs.getDate("publication"));
                rows.add(book);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return rows;
        
    }
}
