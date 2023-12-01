package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Empleado;
import modelo.Producto;

public class Controlador_Producto {
    
     /**
     * **************************************************
     * metodo para guardar un nuevo producto
     * **************************************************
     */
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into Producto values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getCodProveedor());
            consulta.setInt(3, objeto.getCodCategoria());           
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getNombre());
            java.sql.Date fechaVencimientoSQL = new java.sql.Date(objeto.getFechaVencimiento().getTime());
            consulta.setDate(6, fechaVencimientoSQL);
            consulta.setInt(7, objeto.getStock());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    
    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select Nombre from Producto where Nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Producto: " + e);
        }
        return respuesta;
    }
    
    
     /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
//    public boolean actualizar(Producto objeto, int codProducto) {
//        boolean respuesta = false;
//        Connection cn = Conexion.conectar();
//        try {
//
//            PreparedStatement consulta = cn.prepareStatement("update Producto set CodProveedor=?, CodCategoria = ?, Precio = ?, Nombre= ?, FechaVencimiento = ?, Stock = ? where CodProducto ='" + codProducto + "'");
//            consulta.setInt(1, objeto.getCodProveedor());
//            consulta.setInt(2, objeto.getCodCategoria());           
//            consulta.setDouble(3, objeto.getPrecio());
//            consulta.setString(4, objeto.getNombre());
//            consulta.setString(5, objeto.getFechaVencimiento());
//            consulta.setInt(6, objeto.getStock());
//           
//            if (consulta.executeUpdate() > 0) {
//                respuesta = true;
//            }
//            cn.close();
//        } catch (SQLException e) {
//            System.out.println("Error al actualizar producto: " + e);
//        }
//        return respuesta;
//    }
    
       public boolean actualizar(Producto objeto, int codProducto) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    try {
        PreparedStatement consulta = cn.prepareStatement("update Producto set CodProveedor=?, CodCategoria=?, Precio=?, Nombre=?, FechaVencimiento=?, Stock=? where CodProducto=?");
        consulta.setInt(1, objeto.getCodProveedor());
        consulta.setInt(2, objeto.getCodCategoria());
        consulta.setDouble(3, objeto.getPrecio());
        consulta.setString(4, objeto.getNombre());
        java.sql.Date fechaVencimientoSQL = new java.sql.Date(objeto.getFechaVencimiento().getTime());
        consulta.setDate(5, fechaVencimientoSQL);
        consulta.setInt(6, objeto.getStock());
        consulta.setInt(7, codProducto);

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar producto: " + e);
    }
    return respuesta;
}

    
    
    /**
     * **************************************************
     * metodo para eliminar un producto
     * **************************************************
     */
    public boolean eliminar(int codProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Producto where CodProducto ='" + codProducto + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }
    
    public Producto buscarporCod(int cod){
        
        Connection cn = Conexion.conectar();
        Producto producto = null;
        
        try{
            PreparedStatement consulta = cn.prepareStatement("select * from Producto where CodProducto = ?");
            consulta.setInt(1,cod);
            
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()){
                producto = new Producto();
                producto.setCodProducto(resultado.getInt("CodProducto"));
                producto.setNombre(resultado.getString("Nombre"));
                producto.setFechaVencimiento(resultado.getDate("FechaVencimiento"));
                producto.setPrecio(resultado.getDouble("Precio"));
                producto.setStock(resultado.getInt("Stock"));
            }
            cn.close();
        } catch(SQLException e){
            System.out.println("Error al buscar Producto por su código: " + e);
        }
        return producto;
    }
    
    
}
