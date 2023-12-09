package vista;


import modelo.Login;
import controlador.Controlador_Login;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - PRINCE DENT");
        this.setSize(new Dimension(740, 550));
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/logo.png"));
        return retValue;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_password1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton_IniciarSesion = new javax.swing.JButton();
        jCheckBox_ver_clave = new javax.swing.JCheckBox();
        jButton_registrar = new javax.swing.JButton();
        txt_password_visible = new javax.swing.JTextField();

        txt_password1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/p2.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/c1.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 520));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 292, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/004-clinica-dental.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 91, 114));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/019-usuario.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 242, 66, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/017-contrasena-1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 339, 46, 52));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 267, 205, -1));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 210, -1));

        jButton_IniciarSesion.setBackground(new java.awt.Color(51, 153, 255));
        jButton_IniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_IniciarSesion.setText("Ingresar");
        jButton_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 408, 134, 36));

        jCheckBox_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ver_claveMouseClicked(evt);
            }
        });
        jPanel2.add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jButton_registrar.setBackground(new java.awt.Color(51, 153, 255));
        jButton_registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_registrar.setText("Registrarse");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 456, 134, 36));

        txt_password_visible.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 210, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 0, 440, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        //METODO U ACCION PARA QUE AL DAR ENTER CAMBIE DE CAMPO DE INGRESO DE DATOS
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_password.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        //METODO U ACCION PARA QUE AL DAR ENTER INICIE SESION
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.Login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void jButton_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarSesionActionPerformed
        this.Login();
    }//GEN-LAST:event_jButton_IniciarSesionActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        this.setVisible(false);
        FrmRegistro form = new FrmRegistro();
        form.setVisible(true);
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jCheckBox_ver_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveMouseClicked
        if (jCheckBox_ver_clave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_password.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_ver_claveMouseClicked

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_IniciarSesion;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JCheckBox jCheckBox_ver_clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password1;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        String nombreUsuario = txt_usuario.getText().trim();
        String clave = new String(txt_password.getPassword()).trim();

        if (!nombreUsuario.isEmpty() && !clave.isEmpty()) {
            Controlador_Login controlLogin = new Controlador_Login();
            Login login = new Login();
            login.setNombre(nombreUsuario);
            login.setClave(clave);
            
            if (controlLogin.loginUser(login)) {
                FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Nombre o Clave Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
    }
    
    
}
