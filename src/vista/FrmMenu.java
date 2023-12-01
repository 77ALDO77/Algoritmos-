
package vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.Color;


public class FrmMenu extends javax.swing.JFrame {

    private static JDesktopPane jDesktopPane_menu;
   
    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("PRINCE DENT");
        setIconImage(getIconImage());
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        FrmMenu.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
        
        this.getContentPane().setBackground(Color.BLACK);

    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_registrar_paciente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_paciente = new javax.swing.JMenuItem();
        jMenuItem_ficha_paciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_registrar_empleado = new javax.swing.JMenuItem();
        jMenuItem_gestionar_empleado = new javax.swing.JMenuItem();
        jMenuItem_especialidad = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_registrar_cita = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cita = new javax.swing.JMenuItem();
        jMenuItem_facturar_cita = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_registar_servicios = new javax.swing.JMenuItem();
        jMenuItem_clasificacion = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_registrar_area = new javax.swing.JMenuItem();
        jMenuItem_gestionarArea = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_registrar_categoria = new javax.swing.JMenuItem();
        jMenuItem_registrar_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_registrar_proveedor = new javax.swing.JMenuItem();
        jMenuItem_gestionar_proveedor = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_Compra = new javax.swing.JMenuItem();
        jMenuItem_gestionar_compra = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setBackground(new java.awt.Color(102, 153, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/001-paciente.png"))); // NOI18N
        jMenu1.setText("Paciente");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_paciente.setText("Registrar Paciente");
        jMenuItem_registrar_paciente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_registrar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_pacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_registrar_paciente);

        jMenuItem_gestionar_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_paciente.setText("Gestionar Paciente");
        jMenuItem_gestionar_paciente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_pacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_paciente);

        jMenuItem_ficha_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_ficha_paciente.setText("Ficha");
        jMenuItem_ficha_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ficha_pacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_ficha_paciente);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 153, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/017-empleado.png"))); // NOI18N
        jMenu2.setText("Empleados");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_empleado.setText("Registrar Empleado");
        jMenuItem_registrar_empleado.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registrar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_empleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_registrar_empleado);

        jMenuItem_gestionar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_empleado.setText("Gestionar Empleado");
        jMenuItem_gestionar_empleado.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_empleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_empleado);

        jMenuItem_especialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_especialidad.setText("Especialidades");
        jMenuItem_especialidad.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_especialidadActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_especialidad);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(102, 153, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/003-calendario.png"))); // NOI18N
        jMenu3.setText("Cita");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_cita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_cita.setText("Registrar Cita");
        jMenuItem_registrar_cita.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_registrar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_citaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_registrar_cita);

        jMenuItem_gestionar_cita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_cita.setText("Gestionar Cita");
        jMenuItem_gestionar_cita.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_citaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cita);

        jMenuItem_facturar_cita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_facturar_cita.setText("Registro Pagó");
        jMenuItem_facturar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_facturar_citaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_facturar_cita);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(102, 153, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/022-paquete.png"))); // NOI18N
        jMenu4.setText("Servicios");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registar_servicios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registar_servicios.setText("Registrar Servicio");
        jMenuItem_registar_servicios.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registar_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registar_serviciosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_registar_servicios);

        jMenuItem_clasificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_clasificacion.setText("Clasificación");
        jMenuItem_clasificacion.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_clasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clasificacionActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_clasificacion);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(102, 153, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/004-dentista.png"))); // NOI18N
        jMenu5.setText("Área de atención");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_area.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_area.setText("Registrar Área");
        jMenuItem_registrar_area.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registrar_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_areaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_registrar_area);

        jMenuItem_gestionarArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarArea.setText("Gestionar Área");
        jMenuItem_gestionarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarAreaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionarArea);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(102, 153, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/023-caja.png"))); // NOI18N
        jMenu6.setText("Producto");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_categoria.setText("Registrar Categoria");
        jMenuItem_registrar_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registrar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_categoriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_registrar_categoria);

        jMenuItem_registrar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_producto.setText("Registrar Producto");
        jMenuItem_registrar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_registrar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_productoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_registrar_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_gestionar_producto);

        jMenuBar1.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(102, 153, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/024-proveedor.png"))); // NOI18N
        jMenu7.setText("Proveedor");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_registrar_proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_registrar_proveedor.setText("Registrar Proveedor");
        jMenuItem_registrar_proveedor.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_registrar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registrar_proveedorActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_registrar_proveedor);

        jMenuItem_gestionar_proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_proveedor.setText("Gestionar Proveedor");
        jMenuItem_gestionar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_proveedorActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_gestionar_proveedor);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(102, 153, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/030-pedido.png"))); // NOI18N
        jMenu8.setText("Compra");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu8.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_Compra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_Compra.setText("Registrar Comprar");
        jMenuItem_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CompraActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_Compra);

        jMenuItem_gestionar_compra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionar_compra.setText("Gestionar Compra");
        jMenu8.add(jMenuItem_gestionar_compra);

        jMenuBar1.add(jMenu8);

        jMenu9.setBackground(new java.awt.Color(102, 153, 255));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/031-apagar.png"))); // NOI18N
        jMenu9.setText("Cerrar Sesión");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_registrar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_pacienteActionPerformed
        InterRegistrarPaciente interRegistrarPaciente = new InterRegistrarPaciente();
        jDesktopPane_menu.add(interRegistrarPaciente);
        interRegistrarPaciente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_pacienteActionPerformed
      
    private void jMenuItem_gestionar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_pacienteActionPerformed
        InterGestionarPaciente interGestionarPaciente = new InterGestionarPaciente();
        jDesktopPane_menu.add(interGestionarPaciente);
        interGestionarPaciente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_pacienteActionPerformed
        
    private void jMenuItem_registrar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_empleadoActionPerformed
        InterRegistrarEmpleado interRegistrarEmpleado = new InterRegistrarEmpleado();
        jDesktopPane_menu.add(interRegistrarEmpleado);
        interRegistrarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_empleadoActionPerformed

    private void jMenuItem_gestionar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_empleadoActionPerformed
        InterGestionarEmpleado interGestionarEmpleado = new InterGestionarEmpleado();
        jDesktopPane_menu.add(interGestionarEmpleado);
        interGestionarEmpleado.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_empleadoActionPerformed

    private void jMenuItem_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_especialidadActionPerformed
        InterEspecialidad interEspecialidad = new InterEspecialidad();
        jDesktopPane_menu.add(interEspecialidad);
        interEspecialidad.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_especialidadActionPerformed

    private void jMenuItem_registrar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_citaActionPerformed
        InterRegistrarCita interRegistrarCita = new InterRegistrarCita();
        jDesktopPane_menu.add(interRegistrarCita);
        interRegistrarCita.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_citaActionPerformed

    private void jMenuItem_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_citaActionPerformed
        InterGestionarCita interGestionarCita = new InterGestionarCita();
        jDesktopPane_menu.add(interGestionarCita);
        interGestionarCita.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_citaActionPerformed

    private void jMenuItem_registar_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registar_serviciosActionPerformed
        InterRegistrarServicio interRegistrarServicio = new InterRegistrarServicio();
        jDesktopPane_menu.add(interRegistrarServicio);
        interRegistrarServicio.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registar_serviciosActionPerformed

    private void jMenuItem_clasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clasificacionActionPerformed
        InterClasificacion interClasificacion = new InterClasificacion();
        jDesktopPane_menu.add(interClasificacion);
        interClasificacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_clasificacionActionPerformed

    private void jMenuItem_registrar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_categoriaActionPerformed
        InterRegistrarCategoria interRegistrarCategoria = new InterRegistrarCategoria();
        jDesktopPane_menu.add(interRegistrarCategoria);
        interRegistrarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_categoriaActionPerformed

    private void jMenuItem_registrar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_productoActionPerformed
        InterRegistrarProducto interRegistrarProducto = new InterRegistrarProducto();
        jDesktopPane_menu.add(interRegistrarProducto);
        interRegistrarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_registrar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_proveedorActionPerformed
        InterRegistrarProveedor interRegistrarProveedor = new InterRegistrarProveedor();
        jDesktopPane_menu.add(interRegistrarProveedor);
        interRegistrarProveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_proveedorActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_facturar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_facturar_citaActionPerformed
        InterRegistroPago interRegistroPago = new InterRegistroPago();
        jDesktopPane_menu.add(interRegistroPago);
        interRegistroPago.setVisible(true);
    }//GEN-LAST:event_jMenuItem_facturar_citaActionPerformed

    private void jMenuItem_registrar_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registrar_areaActionPerformed
        InterRegistrarArea interRegistrarArea = new InterRegistrarArea();
        jDesktopPane_menu.add(interRegistrarArea);
        interRegistrarArea.setVisible(true);
    }//GEN-LAST:event_jMenuItem_registrar_areaActionPerformed

    private void jMenuItem_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_CompraActionPerformed

    private void jMenuItem_ficha_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ficha_pacienteActionPerformed
        InterFicha interFicha = new InterFicha();
        jDesktopPane_menu.add(interFicha);
        interFicha.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ficha_pacienteActionPerformed

    private void jMenuItem_gestionarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarAreaActionPerformed
        InterGestionarArea interGestionarArea = new InterGestionarArea();
        jDesktopPane_menu.add(interGestionarArea);
        interGestionarArea.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionarAreaActionPerformed

    private void jMenuItem_gestionar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_proveedorActionPerformed
        InterGestionarProveedor interGestionarProveedor = new InterGestionarProveedor();
        jDesktopPane_menu.add(interGestionarProveedor);
        interGestionarProveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_proveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Compra;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_clasificacion;
    private javax.swing.JMenuItem jMenuItem_especialidad;
    private javax.swing.JMenuItem jMenuItem_facturar_cita;
    private javax.swing.JMenuItem jMenuItem_ficha_paciente;
    private javax.swing.JMenuItem jMenuItem_gestionarArea;
    private javax.swing.JMenuItem jMenuItem_gestionar_cita;
    private javax.swing.JMenuItem jMenuItem_gestionar_compra;
    private javax.swing.JMenuItem jMenuItem_gestionar_empleado;
    private javax.swing.JMenuItem jMenuItem_gestionar_paciente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_proveedor;
    private javax.swing.JMenuItem jMenuItem_registar_servicios;
    private javax.swing.JMenuItem jMenuItem_registrar_area;
    private javax.swing.JMenuItem jMenuItem_registrar_categoria;
    private javax.swing.JMenuItem jMenuItem_registrar_cita;
    private javax.swing.JMenuItem jMenuItem_registrar_empleado;
    private javax.swing.JMenuItem jMenuItem_registrar_paciente;
    private javax.swing.JMenuItem jMenuItem_registrar_producto;
    private javax.swing.JMenuItem jMenuItem_registrar_proveedor;
    // End of variables declaration//GEN-END:variables
}
