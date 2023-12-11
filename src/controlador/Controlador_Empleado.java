package controlador;

import conexion.Conexion;
import modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Controlador_Empleado {

    /*Metodo para guardar Empleado*/
    public boolean guardar(Empleado objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Empleado values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//codEmpleado
            consulta.setInt(2, objeto.getCodEspecialidad());
            consulta.setString(3, objeto.getNombre());
            consulta.setString(4, objeto.getApellido());
            consulta.setInt(5, objeto.getDni());
            consulta.setString(6, objeto.getCorreo());
            consulta.setInt(7, objeto.getCelular());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Empleado: " + e);
        }
        return respuesta;
    }

    /**
     * metodo para actualizar un Empleado
     */
    public boolean actualizar(Empleado objeto, int codEmpleado) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "UPDATE Empleado SET CodEspecialidad = ?, Nombre = ?, Apellido = ?, DNI = ?, Correo = ?, Celular = ? WHERE CodEmpleado = ?";
            PreparedStatement consulta = cn.prepareStatement(sql);
            consulta.setInt(1, objeto.getCodEspecialidad());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setInt(4, objeto.getDni());
            consulta.setString(5, objeto.getCorreo());
            consulta.setInt(6, objeto.getCelular());
            consulta.setInt(7, codEmpleado);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Empleado: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un Empleado
     * **************************************************
     */
    public boolean eliminar(int codEmpleado) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Empleado where CodEmpleado ='" + codEmpleado + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar Empleado: " + e);
        }
        return respuesta;
    }

    public boolean existeEmpleado(String dni) {

        boolean respuesta = false;
        String sql = "select DNI from Empleado where DNI = '" + dni + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Empleado: " + e);
        }
        return respuesta;
    }

    public Empleado buscarPorDNI(int dni) {

        Connection cn = Conexion.conectar();
        Empleado empleado = null;

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Empleado WHERE DNI = ?");
            consulta.setInt(1, dni);

            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                // Se encontró un paciente, crea un objeto Paciente y establece sus propiedades
                empleado = new Empleado();
                empleado.setCodEmpleado(resultado.getInt("CodEmpleado"));
                empleado.setNombre(resultado.getString("Nombre"));
                empleado.setApellido(resultado.getString("Apellido"));
                empleado.setDni(resultado.getInt("DNI"));
                empleado.setCorreo(resultado.getString("Correo"));
                empleado.setCelular(resultado.getInt("Celular"));

            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Empleado por DNI: " + e);
        }

        return empleado;

    }

}
