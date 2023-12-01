package vista;

import conexion.Conexion;
import controlador.Controlador_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;


public class InterRegistrarProducto extends javax.swing.JInternalFrame {
    
    int obtenerCodProveedorCombo = 0;
    int obtenerCodCategoriaCombo = 0;
    

    public InterRegistrarProducto() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Registrar Producto");
        
        this.CargarComboProveedor();
        this.CargarComboCategorias();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_proveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_fecha_vencimiento = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 170, -1));

        txt_stock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 170, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Categoria:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item1", "Item2", "Item3", "Item4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, -1));

        jComboBox_proveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Proveedor:", "Item1", "Item2", "Item3", "Item4" }));
        jComboBox_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha de Vencimiento :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        txt_fecha_vencimiento.setDateFormatString("yyyy-MM-dd");
        txt_fecha_vencimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_fecha_vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, -1));

        jLabel_wallpaper.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 410, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        Producto producto = new Producto();
        Controlador_Producto controlProducto = new Controlador_Producto();
        String proveedor = "";
        String categoria = "";
        proveedor = jComboBox_proveedor.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_nombre.getText().equals("") || txt_precio.getText().equals("") || txt_fecha_vencimiento.getDate()==null || txt_stock.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_precio.setBackground(Color.red);
            txt_fecha_vencimiento.setBackground(Color.red);
            txt_stock.setBackground(Color.red);
        } else {
            //consulta para ver si el producto ya existe
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {
                if (proveedor.equalsIgnoreCase("Seleccione Proveedor:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione Proveedor.");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione Categoria");
                    } else {
                        try {
                            
                            
                            this.CodProveedor();
                            producto.setCodProveedor(obtenerCodProveedorCombo);
                            
                            //codcategoria - cargar metodo que obtiene el cod de categoria
                            this.CodCategoria();
                            producto.setCodCategoria(obtenerCodCategoriaCombo);
                            
                            String precioTXT = "";
                            double Precio = 0.0;
                            precioTXT = txt_precio.getText().trim();
                            boolean aux = false;
                            /*
                            *Si el usuario ingresa , (coma) como punto decimal,
                            lo transformamos a punto (.)
                             */
                            for (int i = 0; i < precioTXT.length(); i++) {
                                if (precioTXT.charAt(i) == ',') {
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }
                            //evaluar la condicion
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTXT);
                                producto.setPrecio(Precio);
                            }
                            
                            producto.setNombre(txt_nombre.getText().trim());
                            producto.setFechaVencimiento(txt_fecha_vencimiento.getDate());
                            producto.setStock(Integer.parseInt(txt_stock.getText().trim()));
                            
                            
                            
                            if (controlProducto.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Registro Guardado");
                                
                                txt_precio.setBackground(Color.green);
                                txt_nombre.setBackground(Color.green);
                                txt_fecha_vencimiento.setBackground(Color.green);
                                txt_stock.setBackground(Color.green);

                                this.CargarComboCategorias();
                                this.CargarComboProveedor();
                                this.Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos");
            }
        }
        
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed

    private void jComboBox_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_proveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private com.toedter.calendar.JDateChooser txt_fecha_vencimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        
        txt_precio.setText("");        
        txt_nombre.setText("");
        txt_fecha_vencimiento.setDate(null);
        txt_stock.setText("");
        
    }

    private void CargarComboCategorias() {
        
        Connection cn = Conexion.conectar();
        String sql = "select * from Categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione Categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("Nombre"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar Categorias");
        }
        
    }

    private void CargarComboProveedor() {
        
        Connection cn = Conexion.conectar();
        String sql = "select * from Proveedor";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_proveedor.removeAllItems();
            jComboBox_proveedor.addItem("Seleccione Proveedor:");
            while (rs.next()) {
                jComboBox_proveedor.addItem(rs.getString("Nombre"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar Proveedor");
        }
        
    }

    private int CodProveedor() {
        
        String sql = "select * from Proveedor where Nombre = '" + this.jComboBox_proveedor.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerCodProveedorCombo = rs.getInt("CodProveedor");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener Cod Proveedor");
        }
        return obtenerCodProveedorCombo;
    }
    private int CodCategoria() {
        
        String sql = "select * from Categoria where Nombre = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerCodCategoriaCombo = rs.getInt("CodCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerCodCategoriaCombo;
        
    }    
    
}

    

   
