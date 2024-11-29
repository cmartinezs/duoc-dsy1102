package cl.duoc.cmartinez.model.dao;

import cl.duoc.cmartinez.model.BookModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public boolean insert(String author, String title, String isbn, 
            double price, boolean available) throws SQLException {
        PreparedStatement psi = 
                connection.prepareStatement("INSERT INTO books (isbn, author, title, price) VALUES (?,?,?,?)");
        psi.setString(1, isbn);
        psi.setString(2, author);
        psi.setString(3, title);
        psi.setDouble(4, price);
        
        int rowsCount = psi.executeUpdate();
        
        return rowsCount == 1;
    }

    public int delete(String isbn) throws SQLException {
        String sql = "DELETE FROM books WHERE isbn = ?";
        PreparedStatement psd = connection.prepareStatement(sql);
        psd.setString(1, isbn);
        return psd.executeUpdate();
    }
}
