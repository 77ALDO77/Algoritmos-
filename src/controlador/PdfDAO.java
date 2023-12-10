package controlador;

import conexion.Conexion;
import modelo.ExamenPDF;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PdfDAO {

    /*Metodo listar*/
    public ArrayList<ExamenPDF> Listar_ExamenPDF() {
        ArrayList<ExamenPDF> list = new ArrayList<ExamenPDF>();
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM ExamenPDF;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ExamenPDF Examen = new ExamenPDF();
                Examen.setCodigopdf(rs.getInt(1));
                Examen.setNombrepdf(rs.getString(2));
                Examen.setArchivopdf(rs.getBytes(3));
                list.add(Examen);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_PdfExamen(ExamenPDF Examen) {
        Connection cn = Conexion.conectar();
        String sql = "INSERT INTO ExamenPDF (CodPdf, Nombre, Archivo) VALUES(?, ?, ?,?);";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, Examen.getCodigopdf());
            ps.setString(2, Examen.getNombrepdf());
            ps.setBytes(3, Examen.getArchivopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    /*Metodo Modificar*/
    public void Modificar_PdfVO(ExamenPDF Examen) {
        Connection cn = Conexion.conectar();
        String sql = "UPDATE ExamenPDF SET Nombre = ?, Archivo = ? WHERE CodPdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Examen.getNombrepdf());
            ps.setBytes(2, Examen.getArchivopdf());
            ps.setInt(3, Examen.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
    }
    }     

    public void Modificar_PdfVO2(ExamenPDF Examen) {
        Connection cn = Conexion.conectar();
        String sql = "UPDATE ExamenPDF SET Nombre = ? WHERE CodPdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Examen.getNombrepdf());
            ps.setInt(2, Examen.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } // Agregar este bloque catch y cerrar la llave del bloque try
    }

    /*Metodo Eliminar*/
    public void Eliminar_PdfVO(ExamenPDF Examen) {
        Connection cn = Conexion.conectar();
        String sql = "DELETE FROM ExamenPDF WHERE CodPdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, Examen.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutar_archivoPDF(int id) {

        Connection cn = Conexion.conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.prepareStatement("SELECT Archivo FROM ExamenPDF WHERE CodPdf = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

}
