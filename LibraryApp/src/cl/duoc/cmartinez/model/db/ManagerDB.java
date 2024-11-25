package cl.duoc.cmartinez.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cmartinezs
 */
public class ManagerDB {
    private final String protocol;
    private final String engine;
    private final String domain;
    private final String schema;
    private final String driver;
    private Connection connection;

    public ManagerDB(String protocol, String engine, String domain, String schema, String driver) {
        this.protocol = protocol;
        this.engine = engine;
        this.domain = domain;
        this.schema = schema;
        this.driver = driver;
    }
    
    public boolean connect(String user, String password) {
        try {
            Class.forName(this.driver);
            String strConn = String.format("%s:%s://%s/%s", protocol, engine, domain, schema);
            connection = DriverManager.getConnection(strConn, user, password);
            System.out.println("Conexión exitosa");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    }

    public Connection getConnection() {
        return connection;
    }
    
    
}
