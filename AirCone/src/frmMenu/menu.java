/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frmMenu;

import ConexionSQLDB.DataBaseConexion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aaron
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnOrdenes = new javax.swing.JButton();
        btnsucursales = new javax.swing.JButton();
        btnEnvios = new javax.swing.JButton();
        btndirecciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("AirCone");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Bienvenidos al Menú");

        btnClientes.setBackground(new java.awt.Color(0, 102, 204));
        btnClientes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(0, 102, 204));
        btnProductos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/inventario.png"))); // NOI18N
        btnProductos.setText("Inventario Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnOrdenes.setBackground(new java.awt.Color(0, 102, 204));
        btnOrdenes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/ordenes.png"))); // NOI18N
        btnOrdenes.setText("Ordenes");

        btnsucursales.setBackground(new java.awt.Color(0, 102, 204));
        btnsucursales.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnsucursales.setForeground(new java.awt.Color(255, 255, 255));
        btnsucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/sucursal.png"))); // NOI18N
        btnsucursales.setText("Sucursales");

        btnEnvios.setBackground(new java.awt.Color(0, 102, 204));
        btnEnvios.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEnvios.setForeground(new java.awt.Color(255, 255, 255));
        btnEnvios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/envios.png"))); // NOI18N
        btnEnvios.setText("Envios");

        btndirecciones.setBackground(new java.awt.Color(0, 102, 204));
        btndirecciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btndirecciones.setForeground(new java.awt.Color(255, 255, 255));
        btndirecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frmMenu/direccion.png"))); // NOI18N
        btndirecciones.setText("Direcciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdenes)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnvios)
                        .addGap(22, 22, 22)))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsucursales)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndirecciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes)
                    .addComponent(btnProductos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenes)
                    .addComponent(btnsucursales))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvios)
                    .addComponent(btndirecciones))
                .addContainerGap(364, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        //new menu().setVisible(false);
        Cliente ir = new Cliente();
        ir.setVisible(true);
        hide();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Producto ir = new Producto();
        ir.setVisible(true);
        hide();
        
    }//GEN-LAST:event_btnProductosActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEnvios;
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btndirecciones;
    private javax.swing.JButton btnsucursales;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
