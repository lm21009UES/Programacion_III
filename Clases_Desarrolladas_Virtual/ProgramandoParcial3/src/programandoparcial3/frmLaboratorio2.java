/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programandoparcial3;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERICK
 */
public class frmLaboratorio2 extends javax.swing.JFrame {

    /**
     * Creates new form frmLaboratorio2
     */
    public frmLaboratorio2() {
        initComponents();
        coneccion();
        cargarDatos();
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
        TablaEmpleados = new javax.swing.JTable();
        txtCalle = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CALLE", "CIUDAD"
            }
        ));
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleados);

        txtCalle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        txtCiudad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIUDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        btnInsertar.setBackground(new java.awt.Color(153, 0, 0));
        btnInsertar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setBorder(null);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 0, 0));
        btnEditar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 12), new java.awt.Color(0, 102, 0))); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCalle)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked
        // TODO add your handling code here:
        String id = TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 0).toString();
        String nombre = TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 1).toString();
        String calle = TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 2).toString();
        String ciudad = TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 3).toString();
        txtId.setText(id);
        txtNombre.setText(nombre);
        txtCalle.setText(calle);
        txtCiudad.setText(ciudad);
    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String calle = txtCalle.getText();
            String ciudad = txtCiudad.getText();
            PreparedStatement pstm = con.prepareStatement("UPDATE tbl_empleados SET nombreempleado = ?, calle = ?, ciudad = ? WHERE idempleado = ?");
            pstm.setString(1, nombre);
            pstm.setString(2, calle);
            pstm.setString(3, ciudad);
            pstm.setInt(4, id);
            int respuesta = pstm.executeUpdate();
            if(respuesta >0){
                cargarDatos();
                limpiar();
                System.out.println("TRABAJADOR MODIFICADO");
            }else{
                System.out.println("ERROR AL MODIFICAR");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR -> "+ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(txtId.getText());
            PreparedStatement pstm = con.prepareStatement("DELETE FROM tbl_empleados WHERE idempleado = ?");
            pstm.setInt(1, id);
            int respuesta = pstm.executeUpdate();
            if(respuesta >0){
                cargarDatos();
                limpiar();
                System.out.println("TRABAJADOR ELIMINADO");
            }else{
                System.out.println("NO SE HA ELIMINADO");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR -> "+ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        txtId.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public static Connection con;
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
            java.util.logging.Logger.getLogger(frmLaboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLaboratorio2().setVisible(true);
            }
        });
    }
    
    public void coneccion(){
        String url = "jdbc:postgresql://localhost:5432/bd_laboratorio";
        try {
            con = DriverManager.getConnection(url,"postgres", "Melendez20");
            System.out.println("ESTAMOS CONECTADOS");
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR AL CONECTAR EN LA BASE DE DATOS ->"+ex);
        }
    }
    public void cargarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)TablaEmpleados.getModel();
        modelo.getDataVector().removeAllElements();;
        TablaEmpleados.updateUI();
        try {
            Statement smt = con.createStatement();
            String consulta = "SELECT * FROM tbl_empleados";
            ResultSet resultado = smt.executeQuery(consulta);
            while(resultado.next()){
                modelo.addRow(new Object[]{resultado.getInt("idempleado"),resultado.getString("nombreempleado"),resultado.getString("calle"),resultado.getString("ciudad")});
            }
            TablaEmpleados.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR AL CARGAR DATOS -> "+ex);
        }
    }
    public void insertarDatos(){
        try {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String calle = txtCalle.getText();
            String ciudad = txtCiudad.getText();
            PreparedStatement pstm = con.prepareStatement("INSERT INTO tbl_empleados VALUES(?,?,?,?)");
            pstm.setInt(1, id);
            pstm.setString(2, nombre);
            pstm.setString(3, calle);
            pstm.setString(4, ciudad);
            int respuesta = pstm.executeUpdate();
            if(respuesta >0){
                cargarDatos();
                limpiar();
                System.out.println("DATO INSERTADO");
            }else{
                System.out.println("ERROR AL INSERTAR EL DATO");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR -> "+ex);
        }
    }
    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtCalle.setText("");
        txtCiudad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
