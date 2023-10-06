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
  /*try {
            // Cargar el Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión a la base de datos
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Agregar un empleado
            String sql="INSERT INTO empleado (dni,apellido,nombre,acceso,activo)"
                    + "Values (45750239, 'Cuk', 'Esteban',1,1)";
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
  */
    /*try {
      // Cargar el Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión a la base de datos
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Agregar una herramienta
            String sql="INSERT INTO herramienta (nombre,descripcion,stock,estado)"
                    + "Values ('Sierra', 'Metal',6,1)";
            PreparedStatement ps=con.prepareStatement(sql);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Herramienta Agregada Exitosamente");
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
        }*/
        /*try {
                // Cargar el Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión a la base de datos
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Agregar una herramienta
                       String consultaSQL = "SELECT nombre, descripcion, stock, estado FROM herramienta WHERE stock > 10";

            PreparedStatement ps = con.prepareStatement(consultaSQL);
            ResultSet resultado = ps.executeQuery();

            // Procesar y mostrar los resultados
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String descripcion = resultado.getString("descripcion");
                int stock = resultado.getInt("stock");
                boolean estado = resultado.getBoolean("estado");
            

                System.out.println("Nombre: " + nombre);
                System.out.println("Descripción: " + descripcion);
                System.out.println("Stock: " + stock);
                System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
                System.out.println("-------------------");
            }

            resultado.close();
            ps.close();
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
        }*/
               /*try {
                // Cargar el Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            // Establecer la conexión a la base de datos
            String URL = "jdbc:mariadb://localhost:3306/construirsa";
            String usuario = "root";
            String password = "";
            Connection con=DriverManager.getConnection(URL,usuario,password);
                       // Consulta para encontrar el primer empleado ingresado (asumiendo que tiene el ID más bajo)
            String consultaEmpleadoSQL = "SELECT idEmpleado FROM empleado ORDER BY idEmpleado ASC LIMIT 1";
            PreparedStatement psEmpleado = con.prepareStatement(consultaEmpleadoSQL);
            ResultSet resultadoEmpleado = psEmpleado.executeQuery();

            if (resultadoEmpleado.next()) {
                int idEmpleado = resultadoEmpleado.getInt("idEmpleado");

                // Actualizar el estado del empleado a inactivo
                String actualizarEstadoSQL = "UPDATE empleado SET activo = ? WHERE idEmpleado = ?";
                PreparedStatement psActualizarEstado = con.prepareStatement(actualizarEstadoSQL);
                psActualizarEstado.setBoolean(1, false); // Establece el estado a inactivo
                psActualizarEstado.setInt(2, idEmpleado);
                
                int filasAfectadas = psActualizarEstado.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Empleado con ID " + idEmpleado + " dado de baja exitosamente.");
                } else {
                    System.out.println("No se pudo dar de baja al empleado.");
                }

                psActualizarEstado.close();
            } else {
                System.out.println("No se encontraron empleados en la base de datos.");
            }

            resultadoEmpleado.close();
            psEmpleado.close();
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
        }*/
    }
}