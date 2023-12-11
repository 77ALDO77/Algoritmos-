package controlador;

import conexion.Conexion;
import conexion.sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cita;
import modelo.Paciente;

public class Controlador_Cita {

    public Cita buscarPorCodCita(int codCita) {
        Connection cn = Conexion.conectar();
        Cita cita = null;

        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "SELECT c.CodCita, p.Nombres AS PacienteNombres, p.Apellidos AS PacienteApellidos, "
                    + "p.DNI AS PacienteDNI, p.Celular AS PacienteCelular, "
                    + "p.FechaNacimiento AS PacienteFechaNacimiento, "
                    + "concat(e.Nombre, ' ', e.Apellido) AS EmpleadoNombre, "
                    + "a.Nombre AS AreaNombre, c.Fecha AS FechaCita, c.Hora "
                    + "FROM Cita c "
                    + "INNER JOIN Paciente p ON c.CodPaciente = p.CodPaciente "
                    + "INNER JOIN Empleado e ON c.CodEmpleado = e.CodEmpleado "
                    + "INNER JOIN AreaAtencion a ON c.CodArea = a.CodArea "
                    + "WHERE c.CodCita = ?"
            );

            consulta.setInt(1, codCita);

            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                cita = new Cita();
                cita.setCodCita(resultado.getInt("CodCita"));
                cita.setNombre(resultado.getString("PacienteNombres"));
                cita.setApellido(resultado.getString("PacienteApellidos"));
                cita.setFecha_nacimiento(resultado.getDate("PacienteFechaNacimiento"));
                cita.setFecha_cita(resultado.getDate("FechaCita"));
                cita.setDni(resultado.getInt("PacienteDNI"));
                cita.setCelular(resultado.getInt("PacienteCelular"));
                cita.setHora(resultado.getString("Hora"));
                
                //cita.setCodDoctor(resultado.getInt("CodEmpleado"));
                //cita.setCodArea(resultado.getInt("CodArea"));
                //cita.setNombre(resultado.getString("PacienteNombres"));
                
                //cita.setNombre(resultado.getString("EmpleadoNombre"));
                //cita.setApellido(resultado.getString("EmpleadoApellido"));
                
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Cita por Código: " + e);
        }

        return cita;
    }

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

    public boolean RegistrarCita(Cita cita) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            // Registrar la cita
            String[] columnasCita = {"CodCita"}; // Especifica la columna que deseas obtener
            PreparedStatement consultaCita = cn.prepareStatement("INSERT INTO Cita VALUES (?,?,?,?,?,?)", columnasCita);
            consultaCita.setInt(1, 0); // Suponiendo que el primer campo es autoincrementable
            consultaCita.setInt(2, cita.getCodPaciente());
            consultaCita.setInt(3, cita.getCodDoctor());
            consultaCita.setInt(4, cita.getCodArea());
            java.sql.Date fechaCitaSQL = new java.sql.Date(cita.getFecha_cita().getTime());
            consultaCita.setDate(5, fechaCitaSQL);
            consultaCita.setString(6, cita.getHora());

            // Registrar la cita en la tabla Cita
            if (consultaCita.executeUpdate() > 0) {
                // Obtener el último ID de la cita insertada
                ResultSet rsCita = consultaCita.getGeneratedKeys();
                if (rsCita.next()) {
                    int codCita = rsCita.getInt(1);

                    // Registrar el detalle de la cita en la tabla DetalleCita
                    String[] columnasDetalleCita = {"CodDetalleCita"}; // Especifica la columna que deseas obtener
                    PreparedStatement consultaDetalleCita = cn.prepareStatement("INSERT INTO DetalleCita VALUES (?,?,?,?)", columnasDetalleCita);
                    consultaDetalleCita.setInt(1, 0); // Suponiendo que el primer campo es autoincrementable
                    consultaDetalleCita.setInt(2, cita.getCodServicio());
                    consultaDetalleCita.setInt(3, codCita); // Usar el ID de la cita obtenido anteriormente
                    consultaDetalleCita.setInt(4, cita.getCantidad());

                    if (consultaDetalleCita.executeUpdate() > 0) {
                        respuesta = true;
                    }
                }
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al Registrar Cita: " + e);
        }

        return respuesta;
    }

    //end
}
