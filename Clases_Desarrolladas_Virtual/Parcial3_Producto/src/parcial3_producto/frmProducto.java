/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial3_producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERICK
 */
public class frmProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmProducto
     */
    public static Connection con;
    public frmProducto() {
        initComponents();
        conectar();
        transferirDatos();
        txtId.enable(false);
        txtNombre.enable(false);
        txtPrecio.enable(false);
        txtProveedor.enable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRODUCTO");
        setBackground(new java.awt.Color(255, 153, 153));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE PRODUCTO", "PRECIO $", "PROVEEDOR"
            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        txtId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        txtPrecio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        txtProveedor.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVEEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        btnEditar.setBackground(new java.awt.Color(153, 51, 0));
        btnEditar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 51, 0));
        btnEliminar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio)
                    .addComponent(txtNombre)
                    .addComponent(txtId)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        // TODO add your handling code here:
        String id = TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 0).toString();
        String nombre = TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 1).toString();
        String precio = TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 2).toString();
        String proveedor = TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 3).toString();
        txtId.setText(id);
        txtNombre.setText(nombre);
        txtPrecio.setText(precio);
        txtProveedor.setText(proveedor);
        txtNombre.enable(true);
        txtId.enable(true);
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            PreparedStatement pmts = con.prepareStatement("UPDATE tbl_producto SET nombreproducto = ? WHERE idproducto = ?");
            pmts.setString(1, nombre);
            pmts.setInt(2, id);
            int respuesta = pmts.executeUpdate();
            if(respuesta >0){
                transferirDatos();
                limpiar();
                System.out.println("PRODUCTO MODIFICADO");
            }else{
                System.out.println("NO SE HA MODIFICADO NINGUN PRODUCTO");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR -> "+ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(txtId.getText());
            PreparedStatement pmts = con.prepareStatement("DELETE FROM tbl_producto WHERE idproducto = ?");
            pmts.setInt(1, id);
            int respuesta = pmts.executeUpdate();
            if(respuesta >0){
                transferirDatos();
                limpiar();
                System.out.println("PRODUCTO ELIMINADO");
            }else{
                System.out.println("NO SE HA ELIMINADO NINGUN PRODUCTO");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR -> "+ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }
    public void conectar(){
        try {
            String url = "jdbc:postgresql://localhost:5432/db_tienda";
            con = DriverManager.getConnection(url,"postgres","Melendez20");
            System.out.println("SE HA CONECTADO A LA BASE DE DATOS");
        } catch (SQLException ex) {
            //Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR -> "+ex);
        }
    }
    public void transferirDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)TablaProductos.getModel();
        modelo.getDataVector().removeAllElements();
        TablaProductos.updateUI();
        try {
            Statement smt = con.createStatement();
            String consulta = "SELECT tbl_producto.idproducto, tbl_producto.nombreproducto, tbl_producto.precio,tbl_proveedor.nombreproveedor FROM tbl_producto INNER JOIN tbl_proveedor ON tbl_producto.idproveedor = tbl_proveedor.idproveedor;";
            ResultSet resultado = smt.executeQuery(consulta);
            while(resultado.next()){
                modelo.addRow(new Object[]{resultado.getInt("idproducto"),resultado.getString("nombreproducto"),resultado.getString("precio"),resultado.getString("nombreproveedor")});
            }
            TablaProductos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtProveedor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
