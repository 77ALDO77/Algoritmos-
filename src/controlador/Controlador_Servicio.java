package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Servicio;

public class Controlador_Servicio {
    
    /** metodo para guardar un paciente */
    public boolean guardar(Servicio objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Servicio values(?,?,?,?)");
            consulta    .setInt(1, 0);//cod
            consulta.setInt(2, objeto.getCodClasificacion());
            consulta.setString(3, objeto.getDescripcion());
            consulta.setDouble(4, objeto.getPrecio());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Servicio: " + e);
        }
        return respuesta;
    }
    
    
    public boolean existeServicio(String servicio) {
        boolean respuesta = false;
        String sql = "select CodServicio from Servicio where CodServicio = '" + servicio + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Servicio: " + e);
        }
        return respuesta;
    }
    
    
     public boolean actualizar(Servicio objeto, int codServicio) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Servicio set CodClasificacion=?, Descripcion = ?, Precio = ? where CodServicio ='" + codServicio + "'");
            consulta.setInt(1, objeto.getCodClasificacion());
            consulta.setString(2, objeto.getDescripcion());
            consulta.setDouble(3, objeto.getPrecio());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Servicio: " + e);
        }
        return respuesta;
    }
     
     
     public boolean eliminar(int codServicio) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Servicio where CodServicio ='" + codServicio + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar Servicio: " + e);
        }
        return respuesta;
    }
     
     
     
}
