package vista;

import conexion.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALDO
 */
public class InterGestionarCita extends javax.swing.JInternalFrame {

    private int CodCita;

    public InterGestionarCita() {
        initComponents();
        this.setSize(new Dimension(900, 547));
        this.setTitle("Gestionar Cita");
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jComboBox_Area = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox_TipoConsulta = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_Doctor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser_fecha_Cita = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_sexo = new javax.swing.JComboBox<>();
        jDateChooser_fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gestionar Cita");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_citas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha de N.:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Celular:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Área:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 90, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, -1));

        txt_celular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 170, -1));

        txt_dni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 170, -1));

        jComboBox_Area.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Area:", "Item1", "Item2", "Item3", "Item4" }));
        jComboBox_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AreaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Tipo de consulta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));

        jComboBox_TipoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_TipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_TipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione consulta:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_TipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TipoConsultaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_TipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Hora:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 60, 20));

        jComboBox_Doctor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Doctor.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Doctor:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DoctorActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Doctor:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 20));

        jDateChooser_fecha_Cita.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_Cita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jDateChooser_fecha_Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 160, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fecha:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 60, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 300, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Género:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 90, -1));

        jComboBox_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Género:", "F", "M" }));
        jComboBox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sexoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 170, -1));

        jDateChooser_fecha_nacimiento.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_nacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jDateChooser_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 180));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo-diseño.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        

    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jComboBox_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AreaActionPerformed

    private void jComboBox_TipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TipoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TipoConsultaActionPerformed

    private void jComboBox_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DoctorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_sexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton_actualizar;
    public javax.swing.JButton jButton_eliminar;
    public javax.swing.JComboBox<String> jComboBox_Area;
    public javax.swing.JComboBox<String> jComboBox_Doctor;
    public javax.swing.JComboBox<String> jComboBox_TipoConsulta;
    public javax.swing.JComboBox<String> jComboBox_sexo;
    public com.toedter.calendar.JDateChooser jDateChooser_fecha_Cita;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_citas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaCitas() {
        Connection con = Conexion.conectar();

        DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT c.CodCita, p.Nombres, p.Apellidos, p.DNI, p.Celular, "
                + "s.Descripcion AS TipoConsulta, concat(e.Nombre, ' ', e.Apellido) AS Doctor, "
                + "a.Nombre AS Area, c.Fecha AS FechaCita, p.FechaNacimiento "
                + "FROM Cita c "
                + "INNER JOIN Paciente p ON c.CodPaciente = p.CodPaciente "
                + "INNER JOIN Empleado e ON c.CodEmpleado = e.CodEmpleado "
                + "INNER JOIN Servicio s ON c.CodServicio = s.CodServicio "
                + "INNER JOIN AreaAtencion a ON c.CodArea = a.CodArea";

        Statement st;

        try {

            st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            // Cambiar nombre de la tabla
            jTable_citas = new JTable(model);

            jScrollPane1.setViewportView(jTable_citas);

            // Cambiar nombres de columnas
            model.addColumn("Código");
            model.addColumn("Nombres");
            model.addColumn("Apellidos");
            model.addColumn("DNI");
            model.addColumn("Celular");
            model.addColumn("Consulta");
            model.addColumn("Doctor");
            model.addColumn("Área");
            model.addColumn("Fecha Cita");
            model.addColumn("F. Nacimiento");
            while (rs.next()) {

                Object[] fila = new Object[10]; // 10 columnas
                for (int i = 0; i < 10; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar citas: " + e);
        }
    }

    private void limpiarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
