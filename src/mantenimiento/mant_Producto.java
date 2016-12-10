/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento;

import com.demo.ui.Inicio;
import com.demo.ui.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class mant_Producto extends javax.swing.JFrame {

    /**
     * Creates new form Producto
     */
    public mant_Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        CargarMarca();
        CargarProveedor();
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
        jLabel5 = new javax.swing.JLabel();
        txtid_producto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbMarca = new javax.swing.JComboBox<>();
        cbProveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("id_producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Marca");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Precio");

        txtid_producto.setEditable(false);

        btnConsultar.setBackground(new java.awt.Color(153, 0, 0));
        btnConsultar.setText("...");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnGrabar.setFont(new java.awt.Font("Snap ITC", 1, 11)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(0, 0, 102));
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Snap ITC", 1, 11)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbMarca.setBackground(new java.awt.Color(153, 153, 255));
        cbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarcaActionPerformed(evt);
            }
        });

        cbProveedor.setBackground(new java.awt.Color(153, 153, 255));
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(cbMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGrabar)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCantidad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnModificar)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        btnGrabar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true); 
        Consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        btnGrabar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        Modificar();
        JOptionPane.showMessageDialog(null,"MODIFICADO EXITOSAMENTE");
        Limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         btnGrabar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        Eliminar();
        JOptionPane.showMessageDialog(null,"ELIMINADO EXITOSAMENTE");
        Limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        Grabar();
        JOptionPane.showMessageDialog(null,"Grabado Exitosamente");
        Limpiar();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void cbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMarcaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Inicio in=new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(mant_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mant_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mant_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mant_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mant_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtid_producto;
    // End of variables declaration//GEN-END:variables

public void Grabar(){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO producto(nombre,marca,cantidad,precio, id_proveedor)VALUES(?,?,?,?,?)");
              re.setString(1, txtNombre.getText());
              re.setString(2, cbMarca.getSelectedItem().toString());
              re.setInt(3, Integer.parseInt(txtCantidad.getText()) );
              re.setDouble(4, Double.parseDouble(txtPrecio.getText()));
              re.setInt(5, Cargarid_proveedor());
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}
public void Limpiar(){
    txtNombre.setText("");
    cbMarca.setSelectedIndex(-1);
    txtCantidad.setText("");
    txtPrecio.setText("");
    txtid_producto.setText("");
    
}

public void CargarMarca(){
    conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM marca");
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            cbMarca.addItem(ra.getString(1));
            
        }
        cbMarca.setSelectedIndex(-1);
        cone.close();
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
    }
}
public void Consultar(){
    conexion con = new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT producto.*,proveedor.nombre FROM producto inner join proveedor on producto.id_proveedor=proveedor.id_proveedor WHERE producto.nombre='"+txtNombre.getText()+"'");
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            txtid_producto.setText(ra.getString(5));
            txtNombre.setText(ra.getString(1));
            cbMarca.setSelectedItem(ra.getString(2));
            txtCantidad.setText(ra.getString(3));
            txtPrecio.setText(ra.getString(4));
            cbProveedor.setSelectedItem(ra.getString(7));
        }
        cone.close();
        
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
    }
}
public void Modificar(){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE producto SET nombre=?,marca=?,cantidad=?,precio=?, id_proveedor=? WHERE id_producto="+txtid_producto.getText());
        re.setString(1, txtNombre.getText());
              re.setString(2, cbMarca.getSelectedItem().toString());
              re.setInt(3, Integer.parseInt(txtCantidad.getText()) );
              re.setDouble(4, Double.parseDouble(txtPrecio.getText()));
              re.setInt(5, Cargarid_proveedor());
              re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
    }
}
public void Eliminar(){
    conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareStatement("DELETE FROM producto WHERE id_producto="+txtid_producto.getText());
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }
}

public void CargarProveedor(){
    conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("Select nombre from proveedor");
        ResultSet rst=re.executeQuery();
        while(rst.next()){
            cbProveedor.addItem(rst.getString(1));
            
        }
        cbProveedor.setSelectedIndex(-1);
       
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage()); 
    }
    
    
}

public int Cargarid_proveedor(){
     conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("Select id_proveedor from proveedor where nombre='"+cbProveedor.getSelectedItem().toString()+"'");
        ResultSet rst=re.executeQuery();
       rst.next();
       return rst.getInt(1);
       
       
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());
      return -1;
    }
    
    
}
}
