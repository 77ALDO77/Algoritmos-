
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.*;

public class Controlador_Venta {
    
    //ultimo id de la cabecera
    public static int codVentaRegistrada;
    java.math.BigDecimal coDColVar;
    /**
     * **************************************************
     * metodo para guardar la cabecera de venta
     * **************************************************
     */
    public boolean guardar(Venta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Venta values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//cod
            consulta.setInt(2, objeto.getCodPaciente());
            consulta.setInt(3, objeto.getCodEmpleado());
            java.sql.Date fechaSQL = new java.sql.Date(objeto.getFecha().getTime());
            consulta.setDate(4, fechaSQL);
            consulta.setDouble(5, objeto.getTotal());

            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                coDColVar = rs.getBigDecimal(1);
                codVentaRegistrada = coDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar venta: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para guardar el detalle de venta
     * **************************************************
     */
    public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into DetalleVenta values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);//cod
            consulta.setInt(2, objeto.getCodProducto());           
            consulta.setInt(3, codVentaRegistrada);
            consulta.setInt(4, objeto.getCantidad());
            consulta.setString(5, objeto.getTipoPago());
            consulta.setDouble(6, objeto.getSubTotal());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Detalle de Venta: " + e);
        }
        return respuesta;
    }
    
    
         /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
    public boolean actualizar(Venta objeto, int codVenta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update Venta set codPaciente = ? "
                            + "where codVenta ='" + codVenta + "'");
            consulta.setInt(1, objeto.getCodPaciente());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Venta: " + e);
        }
        return respuesta;
    }
    
    
}
