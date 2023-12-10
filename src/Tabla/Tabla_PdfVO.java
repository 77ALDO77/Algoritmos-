package Tabla;

import controlador.PdfDAO;
import modelo.ExamenPDF;
import java.awt.Image;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabla_PdfVO {

    PdfDAO controlador = null;

    public void visualizar_PdfVO(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("CodPdf");
        dt.addColumn("Nombre");
        dt.addColumn("Archivo");

        ImageIcon icono = null;
        if (get_Image("/IMG/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/IMG/32pdf.png"));
        }

        controlador = new PdfDAO();
        ExamenPDF Examen = new ExamenPDF();
        ArrayList<ExamenPDF> list = controlador.Listar_ExamenPDF();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                Examen = list.get(i);
                fila[0] = Examen.getCodigopdf();
                fila[1] = Examen.getNombrepdf();
                if (Examen.getArchivopdf() != null) {
                    fila[2] = new JButton(icono);
                } else {
                    fila[2] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
