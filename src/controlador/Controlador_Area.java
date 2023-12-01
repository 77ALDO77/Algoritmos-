package controlador;

import conexion.Conexion;
import modelo.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controlador_Area {
    
    
    /**método para guardar una área**/
    public boolean guardar(Area objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into areaatencion values(?,?)");
            consulta   .setInt(1, 0);//cod
            consulta.setString(2, objeto.getNombre());
            if (consulta.executeUpdate() > 0){
                respuesta = true;
            }
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al guardar Area: " + e);
        }
        return respuesta;
    }
    
    /**método para actualizar una área**/
    public boolean actualizar (Area objeto, int codArea){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update areaatencion set Nombre=? where CodArea ='" + codArea + "'");
            consulta.setString(1, objeto.getNombre());
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            cn.close();
        } catch(SQLException e){
            System.out.println("Error al actualizar Area: " + e);
        }
        return respuesta;
    }
    
    /**método para eliminar una área**/
    public boolean eliminar (int codArea) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("delete from areaatencion where CodArea ='" + codArea + "'");
            consulta.executeUpdate();
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            cn.close();
        } catch(SQLException e) {
            System.out.println("Error al eliminar Area: " + e);
        }
        return respuesta;
    }
    
    public boolean existeArea(String codArea) {
        boolean respuesta = false;
        String sql = "select CodArea from areaatencion where CodArea ='" + codArea + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch(SQLException e) {
            System.out.println("Error al consultar Area: " + e);
        }
        return respuesta;
    }
    
    public Area BuscarPorCodArea(int codArea) {
        Connection cn = Conexion.conectar();
        Area area = null;
        
        try {
            PreparedStatement consulta = cn.prepareStatement("select * from areaatencion where CodArea = ?");
            consulta.setInt(1,codArea);
            
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()){
                area = new Area();
                area.setCodArea(resultado.getInt("CodArea"));
                area.setNombre(resultado.getString("Nombre"));
            }
            cn.close();
        } catch(SQLException e) {
            System.out.println("Error al buscar área por su código: " + e);
        }
        return area;
    }
}