package tp12basededatos;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TP12BaseDeDatos {
    public static void main(String[] args) {
  try {
            // Cargar el Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión a la base de datos
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Agregar un empleado
            String sql="INSERT INTO empleado (dni,apellido,nombre,acceso,activo)"
                    + "Values (45850290, 'Rotta', 'Francisco',1,1)";
            PreparedStatement ps=con.prepareStatement(sql);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Empleado Agregado Exitosamente");
            }
            System.out.println("Exito");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar al driver");
        } catch (SQLException ex){
           int error= ex.getErrorCode();
           if(error==1146){
               JOptionPane.showMessageDialog(null, "Tabla Inexistente");
           } else if(error==1049){
               JOptionPane.showMessageDialog(null, "BD inexistente");
           } else{
               JOptionPane.showMessageDialog(null, "Error SQL");
           }
        }
    }
}