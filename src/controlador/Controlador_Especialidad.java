package controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Especialidad;
import conexion.Conexion;

public class Controlador_Especialidad {
    
    /**
     * **************************************************
     * metodo para guardar una nueva Especialidad
     * **************************************************
     */
    public boolean guardar(Especialidad objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into Especialidad values(?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Especialidad: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si la Especialidad registrado ya existe
     * ********************************************************************
     */
    public boolean existeEspecialidad(String especialidad) {
        boolean respuesta = false;
        String sql = "select Nombre from Especialidad where Nombre = '" + especialidad + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Especialidad: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para actualizar una nueva Especialidad
     * **************************************************
     */
    public boolean actualizar(Especialidad objeto, int codEspecialidad) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Especialidad set Nombre=? where CodEspecialidad ='" + codEspecialidad + "'");
            consulta.setString(1, objeto.getNombre());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Especialidad: " + e);
        }

        return respuesta;
    }
    
    
    /**
     * **************************************************
     * metodo para eliminar una nueva Especialidad
     * **************************************************
     */
    public boolean eliminar(int codEspecialidad) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Especialidad where CodEspecialidad ='" + codEspecialidad + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Especialidad: " + e);
        }

        return respuesta;
    }
}
