package tp12basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TP12BaseDeDatos {
    public static void main(String[] args) {
        try {
            // Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
                // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/construirsa";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TP12BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TP12BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
