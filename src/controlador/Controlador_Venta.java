
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.DetalleVenta;
import modelo.Venta;

public class Controlador_Venta {
    
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    /**
     * **************************************************
     * metodo para guardar la cabecera de venta
     * **************************************************
     */
    public boolean guardar(Venta objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Venta values(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getCodPaciente());
            consulta.setString(3,objeto.getFecha());
            consulta.setDouble(4, objeto.getTotal());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: " + e);
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
            PreparedStatement consulta = cn.prepareStatement("insert into DetalleVenta values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(3, objeto.getCodProducto());
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getTotalPagar());

            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de venta: " + e);
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
                    "update Venta set CodPaciente = ? "
                            + "where CodVenta ='" + codVenta + "'");
            consulta.setInt(1, objeto.getCodPaciente());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de venta: " + e);
        }
        return respuesta;
    }
    
    
}
