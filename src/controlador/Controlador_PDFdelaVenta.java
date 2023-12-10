package controlador;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import modelo.Venta;
import modelo.DetalleVenta;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Controlador_PDFdelaVenta {
    private String nombrePaciente;
    private String dniPaciente;
    private String celularPaciente;
    private int codEmpleado;
    private String fechaActual = "";

    public void DatosVenta(Venta venta, String nombrePaciente, String dniPaciente, String celularPaciente, int codEmpleado) {
        this.nombrePaciente = nombrePaciente;
        this.dniPaciente = dniPaciente;
        this.celularPaciente = celularPaciente;
        this.codEmpleado = codEmpleado;
        
    }
    

    public void generarVentaPDF(List<DetalleVenta> listaProductos) throws IOException {
        try {
            //metodo para generar la factura de venta
    

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

            
            String nombreArchivoPDFVenta = "Venta_" + nombrePaciente + "_" + obtenerFechaActual() + ".pdf";
            FileOutputStream archivo = new FileOutputStream("src/pdf/" + nombreArchivoPDFVenta);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            // Agregar contenido al PDF
            // ...
            //agregar celdas
            
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
            Encabezado.addCell(img);

            String ruc = "3456789056";
            String nombre = "Prince Dent";
            String celular = "984051931";
            String direccion = "LIMA - Puente Piedra";
            String razon = "Buscamos mejorar la Salud de nuestros pacientes";

            Encabezado.addCell("");//celda vacia
            Encabezado.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre + "\nCELULAR: " + celular + "\nDIRECCION: " + direccion + "\nRAZON SOCIAL: " + razon);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);


            // Ejemplo: Agregar detalles de productos a una tabla
            PdfPTable tablaProducto = new PdfPTable(4);
            // Agregar encabezados de la tabla
            tablaProducto.addCell("Cantidad");
            tablaProducto.addCell("Descripción");
            tablaProducto.addCell("Precio Unitario");
            tablaProducto.addCell("Precio Total");

            for (DetalleVenta detalle : listaProductos) {
                tablaProducto.addCell(String.valueOf(detalle.getCantidad()));
                tablaProducto.addCell(detalle.getNombre());  // Ajusta esto según tu modelo
                tablaProducto.addCell(String.valueOf(detalle.getPrecioUnitario()));
                tablaProducto.addCell(String.valueOf(detalle.getTotalPagar()));
            }

            doc.add(tablaProducto);

            // Resto del contenido del PDF
            // ...

            doc.close();
            archivo.close();

            // Abrir el documento al ser generado automáticamente
            Desktop.getDesktop().open(new File("src/pdf/" + nombreArchivoPDFVenta));
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    private String obtenerFechaActual() {
        Date date = new Date();
        return new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(date);
    }
}
