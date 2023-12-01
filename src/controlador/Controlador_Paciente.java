package controlador;

import conexion.Conexion;
import modelo.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class Controlador_Paciente {
    
    
    /** metodo para guardar un paciente */
    public boolean guardar(Paciente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("insert into Paciente values(?,?,?,?,?,?,?)");
            consulta    .setInt(1, 0);//cod
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido()); 
            java.sql.Date fechaNacimientoSQL = new java.sql.Date(objeto.getFecha_nacimiento().getTime());
            consulta.setDate(4, fechaNacimientoSQL);
            consulta.setInt(5, objeto.getDni());
            consulta.setInt(6, objeto.getCelular());
            consulta.setString(7, objeto.getSexo());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Paciente: " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int codPaciente) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    try {
        PreparedStatement consulta = cn.prepareStatement("DELETE FROM Paciente WHERE CodPaciente = ?");
        consulta.setInt(1, codPaciente);
        
        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al eliminar Paciente: " + e);
    }
    return respuesta;
    }


    public boolean existePaciente(String dni) {
        boolean respuesta = false;
        String sql = "select DNI from Paciente where DNI = '" + dni + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Paciente: " + e);
        }
        return respuesta;
        
   
    }
    

    public boolean actualizar(Paciente objeto, int codPaciente) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    try {
        // Elimina las comillas simples alrededor de codPaciente
        PreparedStatement consulta = cn.prepareStatement("update Paciente set Nombres = ?, Apellidos = ?, FechaNacimiento = ?, DNI = ?, Celular = ?, Sexo = ? where CodPaciente = ?");
        consulta.setString(1, objeto.getNombre());
        consulta.setString(2, objeto.getApellido());
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(objeto.getFecha_nacimiento().getTime());
        consulta.setDate(3, fechaNacimientoSQL);
        consulta.setInt(4, objeto.getDni());
        consulta.setInt(5, objeto.getCelular());
        consulta.setString(6, objeto.getSexo());
        consulta.setInt(7, codPaciente);  // Establece el valor de CodPaciente sin comillas simples

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar Paciente: " + e);
    }
    return respuesta;
}

    
    
    
    
    
    
    public Paciente buscarPorDNI(int dni) {
    Connection cn = Conexion.conectar();
    Paciente paciente = null;

    try {
        PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Paciente WHERE DNI = ?");
        consulta.setInt(1, dni);

        ResultSet resultado = consulta.executeQuery();

        if (resultado.next()) {
            // Se encontró un paciente, crea un objeto Paciente y establece sus propiedades
            paciente = new Paciente();
            paciente.setCodPaciente(resultado.getInt("CodPaciente"));
            paciente.setNombre(resultado.getString("Nombres"));
            paciente.setApellido(resultado.getString("Apellidos"));
            paciente.setFecha_nacimiento(resultado.getDate("FechaNacimiento"));
            paciente.setDni(resultado.getInt("DNI"));
            paciente.setCelular(resultado.getInt("Celular"));
            paciente.setSexo(resultado.getString("Sexo"));
        }

        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al buscar Paciente por DNI: " + e);
    }

    return paciente;
}


        
    }

