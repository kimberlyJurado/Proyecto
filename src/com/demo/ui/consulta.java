/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class consulta extends javax.swing.JFrame {

    /**
     * Creates new form consulta
     */
    public consulta() {
        initComponents();
        CargarVendedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbVendedor = new javax.swing.JRadioButton();
        rbProducto = new javax.swing.JRadioButton();
        cbVendedor = new javax.swing.JComboBox<>();
        txtProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rbVendedor);
        rbVendedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbVendedor.setForeground(new java.awt.Color(204, 0, 0));
        rbVendedor.setText("Vendedor");
        rbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVendedorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbProducto);
        rbProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbProducto.setForeground(new java.awt.Color(204, 0, 0));
        rbProducto.setText("Producto");
        rbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProductoActionPerformed(evt);
            }
        });

        cbVendedor.setBackground(new java.awt.Color(255, 51, 51));
        cbVendedor.setEnabled(false);

        txtProducto.setEnabled(false);

        jtVendedor.setBackground(new java.awt.Color(153, 153, 255));
        jtVendedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id Factura", "Fecha Emision", "Vendedor", "Producto", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtVendedor);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbVendedor)
                        .addGap(18, 18, 18)
                        .addComponent(cbVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbProducto)
                        .addGap(18, 18, 18)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbVendedor)
                            .addComponent(cbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProducto)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscar.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 153));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnBuscar)
                .addGap(43, 43, 43)
                .addComponent(btnCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVendedorActionPerformed
        // TODO add your handling code here:
        cbVendedor.setEnabled(true);
        txtProducto.setEnabled(false);
        Limpiar();
    }//GEN-LAST:event_rbVendedorActionPerformed

    private void rbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProductoActionPerformed
        // TODO add your handling code here:
        cbVendedor.setEnabled(false);
        txtProducto.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_rbProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Consulta();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtVendedor;
    private javax.swing.JRadioButton rbProducto;
    private javax.swing.JRadioButton rbVendedor;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

public void Limpiar(){
    txtProducto.setText("");
    cbVendedor.setSelectedIndex(-1);
}
public void CargarVendedor(){
    conexion con=new conexion();
    try{
        Connection conex=con.conexion();
        PreparedStatement pst=conex.prepareCall("SELECT nombre FROM vendedor");
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            cbVendedor.addItem(rs.getString(1));
        }
        cbVendedor.setSelectedIndex(-1);
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    
}

public void Consulta(){
    String sql="";
    if(rbVendedor.isSelected()){
        sql="SELECT detalle_factura.*,factura.nombre_vendedor, factura.total, factura.fecha_emision FROM detalle_factura  INNER JOIN factura ON detalle_factura.id_factura = factura.id_factura  where factura.nombre_vendedor='"+cbVendedor.getSelectedItem().toString()+"'";
        
    }else{
        if(rbProducto.isSelected()){
        sql="SELECT detalle_factura.*,factura.nombre_vendedor, factura.total, factura.fecha_emision FROM detalle_factura  INNER JOIN factura ON detalle_factura.id_factura = factura.id_factura where detalle_factura.nombre_producto='"+txtProducto.getText()+"'";
           
        }
    }
    Buscar(sql);
    
}
public void Buscar(String sql){
    DefaultTableModel modelo= (DefaultTableModel) jtVendedor.getModel();
    modelo.setRowCount(0);
    Object tabla[]=new Object[5];
    conexion con=new conexion();
    try{
    Connection conex=con.conexion();
        PreparedStatement pst=conex.prepareCall(sql);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            tabla[0]=rs.getString(1);
            tabla[1]=rs.getString(8);
            tabla[2]=rs.getString(6);
            tabla[3]=rs.getString(5) + " " + rs.getString(4);
            tabla[4]=rs.getString(7);
            modelo.addRow(tabla);
            
        }
        jtVendedor.setModel(modelo);
    }
    catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
}

}

