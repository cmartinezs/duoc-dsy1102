package cl.duoc.cmartinez;

import cl.duoc.cmartinez.controller.MainController;
import cl.duoc.cmartinez.model.dao.BookDAO;
import cl.duoc.cmartinez.model.db.ManagerDB;
import cl.duoc.cmartinez.model.dao.UserDAO;
import cl.duoc.cmartinez.view.LibraryView;
import cl.duoc.cmartinez.view.LoginView;

import java.sql.Connection;

/**
 *
 * @author cmartinezs
 */
public class LibraryApp {
    private static final String DB_PROTOCOL = "jdbc";
    private static final String DB_ENGINE = "mysql";
    private static final String DB_DOMAIN = "localhost:3306";
    private static final String DB_SCHEMA = "library";
    private static final String DB_USER = "library_java_user";
    private static final String DB_PASSWORD = "$j4v4Us3r!";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creating controller");
        Connection conn = createConnection();
        MainController ctrl = new MainController(
                new LoginView(), 
                new LibraryView(), 
                new UserDAO(conn),
                new BookDAO(conn)
        );
        System.out.println("Show login");
        ctrl.showLibrary();
    }

    public static Connection createConnection() {
        ManagerDB db = new ManagerDB(
                DB_PROTOCOL,
                DB_ENGINE,
                DB_DOMAIN,
                DB_SCHEMA,
                DB_DRIVER
        );
        if (!db.connect(DB_USER, DB_PASSWORD)) {
            throw new RuntimeException("Error connecting to database");
        }
        return db.getConnection() ;
    }
    
}
