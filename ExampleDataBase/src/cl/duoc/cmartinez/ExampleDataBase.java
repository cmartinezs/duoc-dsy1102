/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.cmartinez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author cmartinezs
 */
public class ExampleDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            // carga la clase controlador
            Class.forName("com.mysql.cj.jdbc.Driver"); // nombre del controlador de JDBC

            // establece la conexión a la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/libreria", "java_user", "12345"); // URL de la base de datos
            System.out.println("Conexión exitosa");
            
            Statement stmnt = conexion.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * FROM libro");
            while(rs.next()){
                int idlibro = rs.getInt("idlibro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                Date publicacion = rs.getDate("publicacion");
                int precio = rs.getInt("precio");
                boolean disponible = rs.getBoolean("disponible");
                
                System.out.println("ID: "+idlibro+" | "
                        + "Titulo: "+titulo+"| "
                        + "Autor: "+autor+"| "
                        + "Publicacion: "+publicacion+"| "
                        + "Precio: "+precio+"| "
                        + "Disponible: "+disponible);
            }
            
            PreparedStatement psi = 
                    conexion.prepareStatement
        ("INSERT INTO `libreria`.`libro` (`titulo`, `autor`, `publicacion`, `precio`, `disponible`) VALUES (?, ?, ?, ?, ?)");
            
            psi.setString(1, "El Señor de Los Anillos");
            psi.setString(2, "JRR Tolkien");
            psi.setDate(3, Date.valueOf("1945-06-05"));
            psi.setInt(4, 30000);
            psi.setBoolean(5, true);
            
            int rowsi = psi.executeUpdate();
            
            System.out.println("Filas afectadas i: " + rowsi);
            
            PreparedStatement psd = 
                    conexion.prepareStatement("DELETE FROM libro WHERE titulo = ?");
            psd.setString(1, "El Señor de Los Anillos");
            int rowd = psd.executeUpdate();
            System.out.println("Filas eliminadas d: " + rowsi);
            
            PreparedStatement psu = 
                    conexion.prepareStatement("UPDATE libro SET precio = ? WHERE titulo = ?");
            psu.setInt(1, 0);
            psu.setString(2, "1984");
            int rowu = psu.executeUpdate();
            System.out.println("Filas actualizadas a: " + rowu);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
