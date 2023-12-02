package vista;


import conexion.Conexion;
import controlador.Controlador_Producto;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;


public class InterGestionarProducto extends javax.swing.JInternalFrame {
    
    private int codProducto;
    int obtenerCodProveedorCombo = 0;
    int obtenerCodCategoriaCombo = 0;

    public InterGestionarProducto() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Productos");

        this.CargarTablaProductos();
        this.CargarComboProveedor();
        this.CargarComboCategoria();
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
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jComboBox_proveedor = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        txt_codBuscado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_vencimiento = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_productos);

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
        jLabel2.setText("Proveedor:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        txt_stock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Categoria:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Precio:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Stock:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 170, -1));

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 170, -1));

        jComboBox_proveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Proveedor:", "Item1", "Item2", "Item3", "Item4" }));
        jComboBox_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_proveedorActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, -1));

        txt_codBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codBuscadoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_codBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 300, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("FV:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 90, -1));

        txt_fecha_vencimiento.setDateFormatString("yyyy-MM-dd");
        txt_fecha_vencimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txt_fecha_vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 120));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo-diseño.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        Producto producto = new Producto();
        Controlador_Producto controlProducto = new Controlador_Producto();
        String proveedor = "";
        String categoria = "";
        proveedor = jComboBox_proveedor.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_precio.getText().isEmpty()||  txt_nombre.getText().isEmpty() || txt_fecha_vencimiento.getDate()== null ||  txt_stock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            if (proveedor.equalsIgnoreCase("Seleccione Proveedor:")) {
                JOptionPane.showMessageDialog(null, "Seleccione Proveedor.");
            } else {
                if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione categoria");
                } else {
                    try {
                        producto.setNombre(txt_nombre.getText().trim());
                        producto.setFechaVencimiento(txt_fecha_vencimiento.getDate());
                        producto.setStock(Integer.parseInt(txt_stock.getText().trim()));
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
                        
                        this.CodProveedor();
                        producto.setCodProveedor(obtenerCodProveedorCombo);
                        
                        this.CodCategoria();
                        producto.setCodCategoria(obtenerCodCategoriaCombo);
                        

                        if (controlProducto.actualizar(producto, codProducto)) {
                            JOptionPane.showMessageDialog(null, "Registro Actualizado");
                            this.CargarComboCategoria();
                            this.CargarTablaProductos();
                            this.CargarComboProveedor();
                            this.Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

        Controlador_Producto controlProducto = new Controlador_Producto();
        if (codProducto == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
        } else {
            if (!controlProducto.eliminar(codProducto)) {
                JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                this.CargarTablaProductos();
                this.CargarComboCategoria();
                this.CargarComboProveedor();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar producto!");
            }
        }
        
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jComboBox_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_proveedorActionPerformed

    private void txt_codBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codBuscadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codBuscado = txt_codBuscado.getText().trim();
        
        if(!codBuscado.isEmpty()){
            buscarProductoporCodigo(codBuscado);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número de código válido para buscar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_codBuscado;
    private com.toedter.calendar.JDateChooser txt_fecha_vencimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
    
    
    private void Limpiar() {
        
        txt_nombre.setText("");
        txt_precio.setText("");
        txt_fecha_vencimiento.setDate(null);
        txt_stock.setText("");
        jComboBox_proveedor.setSelectedItem("Seleccione Proveedor:");
        jComboBox_categoria.setSelectedItem("Seleccione Categoria:");
        
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
            System.out.println("Error al obener Cod. Proveedor");
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
            System.out.println("Error al obener Cod Categoria");
        }
        return obtenerCodCategoriaCombo;
        
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
            System.out.println("¡Error al cargar Proveedores!");
        }
    }
    

    private void CargarComboCategoria() {
        
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
            System.out.println("¡Error al cargar categorias!");
        }
        
    }
    
    String nombreProveedor = "";
    String nombreCategoria ="";


    private void CargarTablaProductos() {
    Connection con = Conexion.conectar();
    DefaultTableModel model = new DefaultTableModel();

        String sql = "SELECT P.CodProducto,P.Nombre AS NombreProducto, P.Precio, P.FechaVencimiento, P.Stock, " +
                     "C.Nombre AS Categoria, " + "PR.Nombre AS Proveedor " + "FROM Producto P " +
                     "INNER JOIN Categoria C ON P.CodCategoria = C.CodCategoria " +
                     "INNER JOIN Proveedor PR ON P.CodProveedor = PR.CodProveedor";

        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Creación de la tabla con nombres de columnas correspondientes
            model.addColumn("N°");
            model.addColumn("Nombre ");
            model.addColumn("Precio");
            model.addColumn("Fecha Vencimiento");
            model.addColumn("Stock");
            model.addColumn("Categoria");
            model.addColumn("Proveedor");

            while (rs.next()) {
                
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla de productos: " + e);
        }

        // Asegúrate de configurar la tabla adecuadamente con el modelo
        jTable_productos.setModel(model);

        // Evento para obtener el ID del producto seleccionado
        jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    codProducto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSeleccionado(codProducto);
                }
            }
        });
    }

    
        private void EnviarDatosProductoSeleccionado(int codProducto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from Producto where CodProducto = '" + codProducto + "'");
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int  codPro= rs.getInt("CodProveedor");
                int codCate = rs.getInt("CodCategoria");
                jComboBox_proveedor.setSelectedItem(relacionarProveedor(codPro));
                jComboBox_categoria.setSelectedItem(relacionarCategoria(codCate));
                txt_precio.setText(rs.getString("Precio"));
                txt_nombre.setText(rs.getString("Nombre"));
                txt_fecha_vencimiento.setDate(rs.getDate("FechaVencimiento"));
                txt_stock.setText(rs.getString("Stock"));
                
                
                
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }

    /*
     * **************************************************
     * Metodo para relacionar categorias
     * **************************************************
     */
    private String relacionarProveedor(int codProveedor) {

        String sql = "select Nombre from Proveedor where CodProveedor = '" + codProveedor + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreProveedor = rs.getString("Nombre");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el codigo del Proveedor!");
        }
        return nombreProveedor;
    }
    
    
    private String relacionarCategoria(int codCategoria) {

        String sql = "select Nombre from Categoria where CodCategoria = '" + codCategoria + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreCategoria = rs.getString("Nombre");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el codigo de la categoria!");
        }
        return nombreCategoria;
    }
    
    private void buscarProductoporCodigo(String codBuscado){
        if(!codBuscado.isEmpty()){
            try{
                int cod = Integer.parseInt(codBuscado);
                Controlador_Producto controlProducto = new Controlador_Producto();
                Producto producto = controlProducto.buscarporCod(cod);
                
                if(producto != null){
                    txt_nombre.setText(producto.getNombre());
                    txt_precio.setText(String.valueOf(producto.getPrecio()));
                    txt_fecha_vencimiento.setDate(producto.getFechaVencimiento());
                    txt_stock.setText(String.valueOf(producto.getStock()));
                }else{
                    JOptionPane.showMessageDialog(null, "Producto no encontrado para el código ingresado.");
                }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un número de código válido para buscar.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un número de código válido para buscar.");
        }
    }


    


}
