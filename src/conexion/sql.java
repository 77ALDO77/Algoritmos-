
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sql {

    public int auto_increment(String sql) {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cn = Conexion.conectar(); // Utilizar el método conectar de la clase Conexion
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1) + 1;
            }
        } catch (Exception ex) {
            System.out.println("Error al obtener el valor autoincremental: " + ex.getMessage());
            id = 1;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception ex) {
                // Manejo de excepciones al cerrar recursos
            }
        }
        return id;
    }
}
