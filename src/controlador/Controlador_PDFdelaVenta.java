
package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InterFacturarVenta;


public class Controlador_PDFdelaVenta {
    private String nombrePaciente;
    private String dniPaciente;
    private String celularPaciente;


    private String fechaActual = "";
    private String nombreArchivoPDFVenta = "";

    //metodo para obtener datos del cliente
    public void DatosPaciente(int codPaciente) {
        Connection cn = Conexion.conectar();
        String sql = "select * from Paciente where CodPaciente = '" + codPaciente + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombrePaciente = rs.getString("Nombres") + " " + rs.getString("Apellidos");
                dniPaciente = rs.getString("DNI");
                celularPaciente = rs.getString("Celular");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del cliente: " + e);
        }
    }

    //metodo para generar la factura de venta
    public void generarFacturaPDF() {
        try {

            //cargar la fecha actual
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date);
            //cambiar el formato de la fecha de / a _
            String fechaNueva = "";
            for (int i = 0; i < fechaActual.length(); i++) {
                if (fechaActual.charAt(i) == '/') {
                    fechaNueva = fechaActual.replace("/", "_");
                }
            }

            nombreArchivoPDFVenta = "Venta_" + nombrePaciente + "_" + fechaNueva + ".pdf";

            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            archivo = new FileOutputStream(file);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            Image img = Image.getInstance("src/IMG/019-factura.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE); //agregar nueva linea
            fecha.add("Factura: 001" + "\nFecha: " + fechaActual + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);//quitar el borde de la tabla
            //tamaño de las celdas
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            //agregar celdas
            Encabezado.addCell(img);

            String ruc = "3456789056";
            String nombre = "Prince Dent";
            String celular = "984051931";
            String direccion = "LIMA - Puente Piedra";
            String razon = "Buscamos mejorar la Salud de nuestros pacientes";

            Encabezado.addCell("");//celda vacia
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nCELULAR: " +  celular + "\nDIRECCION: " + direccion + "\nRAZON SOCIAL: " + razon);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            //CUERPO
            Paragraph paciente = new Paragraph();
            paciente.add(Chunk.NEWLINE);//nueva linea
            paciente.add("Datos del Paciente: " + "\n\n");
            doc.add(paciente);

            //DATOS DEL PACIENTE
            PdfPTable tablaPaciente = new PdfPTable(4);
            tablaPaciente.setWidthPercentage(100);
            tablaPaciente.getDefaultCell().setBorder(0);//quitar bordes
            //tamaño de las celdas
            float[] ColumnaPaciente = new float[]{25f, 45f, 30f, 40f};
            tablaPaciente.setWidths(ColumnaPaciente);
            tablaPaciente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell paciente1 = new PdfPCell(new Phrase("DNI: ", negrita));
            PdfPCell paciente2 = new PdfPCell(new Phrase("Nombres: ", negrita));
            PdfPCell paciente3 = new PdfPCell(new Phrase("Celular: ", negrita));
            //quitar bordes 
            paciente1.setBorder(0);
            paciente2.setBorder(0);
            paciente3.setBorder(0);
            //agg celda a la tabla
            tablaPaciente.addCell(paciente1);
            tablaPaciente.addCell(paciente2);
            tablaPaciente.addCell(paciente3);
            tablaPaciente.addCell(dniPaciente);
            tablaPaciente.addCell(nombrePaciente);
            tablaPaciente.addCell(celularPaciente);
            //agregar al documento
            doc.add(tablaPaciente);
            
            //ESPACIO EN BLANCO
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            //AGREGAR LOS PRODUCTOS
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            //tamaño de celdas
             float[] ColumnaProducto = new float[]{15f, 50f, 15f, 20f};
             tablaProducto.setWidths(ColumnaProducto);
             tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
             PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ", negrita));
             PdfPCell producto2 = new PdfPCell(new Phrase("Descripcion: ", negrita));
             PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", negrita));
             PdfPCell producto4 = new PdfPCell(new Phrase("Precio Total: ", negrita));
             //quitar bordes
             producto1.setBorder(0);
             producto2.setBorder(0);
             producto3.setBorder(0);
             producto4.setBorder(0);
             //agregar color al encabezadi del producto
             producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            //agg celda a la tabla
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
            
            for(int i = 0; i < InterFacturarVenta.jTable_Venta.getRowCount(); i++){
                String producto = InterFacturarVenta.jTable_Venta.getValueAt(i, 1).toString();
                String cantidad = InterFacturarVenta.jTable_Venta.getValueAt(i, 2).toString();
                String precio = InterFacturarVenta.jTable_Venta.getValueAt(i, 3).toString();
                String total = InterFacturarVenta.jTable_Venta.getValueAt(i, 7).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
            }
            
            //agregar al documento
            doc.add(tablaProducto);
            
            //Total pagar
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: " + InterFacturarVenta.txt_total_pagar.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            //Firma
           Paragraph firma = new Paragraph();
           firma.add(Chunk.NEWLINE);
           firma.add("Cancelacion y firma\n\n");
           firma.add("_______________________");
           firma.setAlignment(Element.ALIGN_CENTER);
           doc.add(firma);
           
            //Mensaje
           Paragraph mensaje = new Paragraph();
           mensaje.add(Chunk.NEWLINE);
           mensaje.add("¡Gracias por su compra!");
           mensaje.setAlignment(Element.ALIGN_CENTER);
           doc.add(mensaje);
           
           //cerrar el documento y el archivo
           doc.close();
           archivo.close();
           
           //abrir el documento al ser generado automaticamente
            Desktop.getDesktop().open(file);
            
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error en: " + e);
        }
    }

}
