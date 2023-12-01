package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import conexion.Conexion;
import modelo.Clasificacion;

public class Controlador_Clasificacion {
    
    public boolean guardar(Clasificacion objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into Clasificacion values(?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Clasificacion: " + e);
        }

        return respuesta;
    }


    public boolean existeClasificacion(String clasificacion) {
        boolean respuesta = false;
        String sql = "select Nombre from Clasificacion where Nombre = '" + clasificacion + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Clasificacion: " + e);
        }
        return respuesta;
    }
    

    public boolean actualizar(Clasificacion objeto, int codClasificacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Clasificacion set Nombre=? where CodClasificacion ='" + codClasificacion + "'");
            consulta.setString(1, objeto.getNombre());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Clasificacion: " + e);
        }

        return respuesta;
    }
    
    

    public boolean eliminar(int codClasificacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Clasificacion where CodClasificacion ='" + codClasificacion+ "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Clasificacion: " + e);
        }

        return respuesta;
    }
}
