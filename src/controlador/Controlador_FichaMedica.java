package controlador;

import conexion.Conexion;
import modelo.FichaMedica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controlador_FichaMedica {
    
    public boolean guardar(FichaMedica objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into FichaMedica values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//cod
            consulta.setInt(2,objeto.getCodPaciente());
            consulta.setString(3, objeto.getExamenes());
            consulta.setString(4, objeto.getAlergias());
            java.sql.Date fechaVisitaSQL = new java.sql.Date(objeto.getFecha_visita().getTime());
            consulta.setDate(5, fechaVisitaSQL);
            consulta.setString(6, objeto.getDiagnostico());
            consulta.setString(7, objeto.getTratamiento());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

  

    public boolean existeFichaMedica(String dni) {
        boolean respuesta = false;
        String sql = "select DNI from FichaMedica where DNI = '" + dni + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar FichaMedica: " + e);
        }
        return respuesta;
        
    }

 
    
}
