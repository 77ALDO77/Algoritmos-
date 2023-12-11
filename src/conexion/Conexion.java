package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Conexión local a tu base de datos
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/PrinceDent2";
            String usuario = "root";
            String contraseña = "4546";
            Connection cn = DriverManager.getConnection(url, usuario, contraseña);
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local: " + e);
        }
        return null;
    }
}