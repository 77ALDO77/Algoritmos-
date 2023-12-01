package controlador;

import modelo.Login;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Controlador_Login {

    public boolean loginUser(Login objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select Nombre, Clave from Login where Nombre = ? and Clave = ?";
        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getClave());
            if (ps.executeQuery().next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion: " + e);
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }

    
    public boolean registrarUsuario(String nombre, String clave) {
    boolean registroExitoso = false;
    
    if (nombre.isEmpty() || clave.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
    } else {
        Connection cn = Conexion.conectar();
        String sql = "INSERT INTO Login (Nombre, Clave) VALUES (?, ?)";
        
        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, clave);
            
            if (ps.executeUpdate() > 0) {
                registroExitoso = true;
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar usuario");
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e);
            JOptionPane.showMessageDialog(null, "Error al registrar usuario");
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
    }
    
    return registroExitoso;
}

    
}
