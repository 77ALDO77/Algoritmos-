package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cita;

public class Controlador_Cita {

    public Cita buscarPorDNI(int dni) {
        Connection cn = Conexion.conectar();
        Cita cita = null;

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Paciente WHERE DNI = ?");
            consulta.setInt(1, dni);

            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                // Se encontró un paciente, crea un objeto Paciente y establece sus propiedades
                cita = new Cita();
                cita.setCodPaciente(resultado.getInt("CodPaciente"));
                cita.setNombre(resultado.getString("Nombres"));
                cita.setApellido(resultado.getString("Apellidos"));
                cita.setFecha_nacimiento(resultado.getDate("FechaNacimiento"));
                cita.setDni(resultado.getInt("DNI"));
                cita.setCelular(resultado.getInt("Celular"));
                cita.setSexo(resultado.getString("Sexo"));
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Paciente por DNI: " + e);
        }

        return cita;
    }

    public boolean RegistrarCita(Cita objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Cita values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getCodPaciente());
            consulta.setInt(3, objeto.getCodDoctor());
            consulta.setInt(4, objeto.getCodArea());
            java.sql.Date FechaCitaSQL = new java.sql.Date(objeto.getFecha_cita().getTime());
            consulta.setDate(5, FechaCitaSQL);
            consulta.setString(6, objeto.getHora());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al Registar Cita: "+ e);
        }
        return respuesta;
    }
    
    //end
}
