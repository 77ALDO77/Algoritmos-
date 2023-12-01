package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Proveedor;

public class Controlador_Proveedor {
    
    /**
     * **************************************************
     * metodo para guardar un nuevo proveedor
     * **************************************************
     */
    public boolean guardar(Proveedor objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Proveedor values(?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getContacto());
            consulta.setString(4, objeto.getPais());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Proveedor: " + e);
        }
        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el Cliente ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeProveedor(int codProveedor) {
        boolean respuesta = false;
        String sql = "select CodProveedor from Proveedor where CodProveedor = '" + codProveedor + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Proveedor: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar un cliente
     * **************************************************
     */
    public boolean actualizar(Proveedor objeto, int codProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update Proveedor set Nombre=?, Contacto = ?, Pais = ? where CodProveedor ='" + codProveedor + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getContacto());
            consulta.setString(3, objeto.getPais());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Proveedor: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un cliente
     * **************************************************
     */
    public boolean eliminar(int codProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from Proveedor where CodProveedor ='" + codProveedor + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar Proveedor: " + e);
        }
        return respuesta;
    }
    
    
    public Proveedor buscarPorContacto(String contacto) {
    Connection cn = Conexion.conectar();
    Proveedor proveedor = null;

    try {
        PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Proveedor WHERE Contacto = ?");
        consulta.setString(1, contacto);

        ResultSet resultado = consulta.executeQuery();

        if (resultado.next()) {
            // Se encontró un paciente, crea un objeto Paciente y establece sus propiedades
            proveedor = new Proveedor();
            proveedor.setCodProveedor(resultado.getInt("CodProveedor"));
            proveedor.setNombre(resultado.getString("Nombre"));
            proveedor.setContacto(resultado.getString("Contacto"));
            proveedor.setPais(resultado.getString("Pais"));
        }

        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al buscar Proveedor por Contacto: " + e);
    }

    return proveedor;
    }
    

    
}
