/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package probandoconexionbasededatos_parcial_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ERICK
 */
public class frmLaboratorio extends javax.swing.JFrame {

    /**
     * Creates new form frmLaboratorio
     */
    public Connection con;
    public frmLaboratorio() {
        initComponents();
        Conectar();
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
        jTableCompania = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableCompania.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID COMPAÑIA", "NOMBRE", "CIUDAD"
            }
        ));
        jTableCompania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompaniaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCompania);

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE COMPAÑIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 3, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        txtCiudad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIUDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 3, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        txtId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 3, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(140, 48, 48));
        btnGuardar.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(157, 78, 78));
        jButton1.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(156, 60, 60));
        btnEditar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad)
                    .addComponent(txtNombre)
                    .addComponent(txtId)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableCompaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompaniaMouseClicked
        // TODO add your handling code here:
        String idRegistro = jTableCompania.getValueAt(jTableCompania.getSelectedRow(), 0).toString();
        txtId.setText(idRegistro);
    }//GEN-LAST:event_jTableCompaniaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            int idR = Integer.parseInt(txtId.getText());
            PreparedStatement prmDelete = con.prepareStatement("DELETE FROM tbl_companias WHERE idcompania = ?");
            prmDelete.setInt(1, idR);
            int respuesta = prmDelete.executeUpdate();
            if(respuesta > 0){
                cargarDatos();
                System.out.println("COMPAÑIA ELIMINADA");
            }else{
                System.out.println("NO SE HA PODIDO ELIMINAR EL REGISTRO");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR DE CONSULTA ->"+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String Ciudad = txtCiudad.getText();
            PreparedStatement smt = con.prepareStatement("UPDATE tbl_companias SET nombrecompania = ?, ciudad = ? WHERE idcompania = ?");
            smt.setString(1, nombre);
            smt.setString(2, Ciudad);
            smt.setInt(3, id);
            int respuesta = smt.executeUpdate();
            if(respuesta >0){
                cargarDatos();
                System.out.println("UNA COMPAÑIA SE HA MODIFICADO");
            }else{
                System.out.println("NO SE HA PODIDO MODIFICAR");
            }
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("OCURRE UN ERROR ->"+ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLaboratorio().setVisible(true);
            }
        });
    }
    public void cargarDatos()
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)jTableCompania.getModel();
        modelo.getDataVector().removeAllElements();
        jTableCompania.updateUI();
        try {
            Statement smt = con.createStatement();
            String consulta = "SELECT * FROM tbl_companias";
            ResultSet resultado = smt.executeQuery(consulta);
            while(resultado.next()){
                modelo.addRow(new Object[]{resultado.getInt("idcompania"),resultado.getString("nombrecompania"), resultado.getString("ciudad")});
            }
            jTableCompania.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(ConexioDB_CLASE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR AL EJECUTAR LA CONSULTA ->"+ex);
        }
    }
    public void Conectar(){
        String url = "jdbc:postgresql://localhost:5432/bd_laboratorio";
        try {
            con = DriverManager.getConnection(url,"postgres","Melendez20");
            System.out.println("ESTAMOS CONECTADOS");
        } catch (SQLException ex) {
            //Logger.getLogger(frmLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR AL CONECTAR A BASE DE DATOS");
        }
        
    }
    public void insertarDatos(){
        try {
            int id = Integer.parseInt(txtId.getText());
            String nombreCompania = txtNombre.getText();
            String Ciudad = txtCiudad.getText();
            PreparedStatement prmt = con.prepareStatement("INSERT INTO tbl_companias VALUES(?,?,?)");
            prmt.setInt(1, id);
            prmt.setString(2, nombreCompania);
            prmt.setString(3, Ciudad);
            int respuesta = prmt.executeUpdate();
            if(respuesta >0){
                cargarDatos();
                System.out.println("DATO INSERTADO");
            }else{
                System.out.println("ERROR AL INSERTAR DATO");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtId.setText("");
        txtNombre.setText("");
        txtCiudad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCompania;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}