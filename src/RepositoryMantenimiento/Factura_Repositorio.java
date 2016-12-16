/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import static com.demo.ui.Factura.tb1;
import static com.demo.ui.Factura.txtFecha;
import static com.demo.ui.Factura.txtNombres;
import com.demo.ui.conexion;
import identidades.Clientes;
import identidades.Detalle_factura;
import identidades.Producto;
import identidades.factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Factura_Repositorio {
    /*ps.setInt(1,buscaridFactura());
        ps.setString(2,tb1.getValueAt(c, 0).toString());
        ps.setString(3, tb1.getValueAt(c, 1).toString());
        ps.setInt(4, Integer.parseInt(tb1.getValueAt(c, 2).toString()));
*/
    
    public void GuardarDetalleFactura(ArrayList<Detalle_factura>Df){
    
        conexion con=new conexion();
    int c=0;
    while(c<tb1.getRowCount()){
    try{
        
        Connection cone=con.conexion();
        PreparedStatement ps=cone.prepareStatement("INSERT INTO detalle_factura (id_factura,nombre_producto,marca_producto,cantidad)VALUES(?,?,?,?)");  
        ps.setInt(1,Df.get(c).getFactura().getId_factura());
        ps.setString(2,Df.get(c).getNombre_producto());
        ps.setString(3,Df.get(c).getMarca_producto());
        ps.setInt(4,Df.get(c).getCantidad());
        ps.executeUpdate();
        c++;
    }catch(SQLException ex){
       System.out.println("ERROR:"+ex.getMessage()); 
    }
    }
}
public void GuardarFactura(factura Fac){
    conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement ps=cone.prepareStatement("INSERT INTO factura (id_cliente,fecha_emision,subtotal,iva,total,nombre_vendedor )VALUES(?,?,?,?,?,?)");
        ps.setInt(1, Fac.getCliente().getId_cliente());
        ps.setString(2,Fac.getFecha_emision());
        ps.setDouble(3,Fac.getSubtotal());
        ps.setDouble(4,Fac.getIva());
        ps.setDouble(5,Fac.getTotal());
        ps.setString(6,Fac.getNombre_vendedor());
        ps.executeUpdate();
    }catch(SQLException ex){
        System.out.println("ERROR:"+ex.getMessage());
    }
}
public int buscaridCliente(){
conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement ps=cone.prepareStatement("Select id_cliente From cliente Where nombres='"+txtNombres.getText()+"'");
       ResultSet re=ps.executeQuery();
       re.next();
       return re.getInt(1);
       
    }catch(SQLException ex){
        System.out.println("ERROR:"+ ex.getMessage());
        return -1;
    }
}
public int buscaridProducto(String Producto){
conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement ps=cone.prepareStatement("Select id_producto From producto Where nombre='"+Producto+"'");
        ResultSet re=ps.executeQuery();
       re.next();
       return re.getInt(1);
       
    }catch(SQLException ex){
        System.out.println("ERROR:"+ ex.getMessage());
        return -1;
    }
}
public int buscaridFactura(){
 conexion con=new conexion();
 try{
     Connection cone =con.conexion();
     PreparedStatement ps=cone.prepareCall("SELECT id_factura FROM factura",1004,1007);
     ResultSet re=ps.executeQuery();
     re.last();
     return re.getInt(1);
     
 }catch(SQLException ex){
     System.out.println("ERROR:"+ ex.getMessage());
        return -1;
 }
}
public void RestarInventario(){
    int c=0;
    conexion con =new conexion();
    while(c<tb1.getRowCount()){
        try{
          Connection cone =con.conexion();
        PreparedStatement ps=cone.prepareStatement("UPDATE producto set cantidad=cantidad-"+tb1.getValueAt(c, 2)+"WHERE nombre='"+tb1.getValueAt(c,0).toString()+"'");
        ps.executeUpdate();
        c++;
          
        }catch(SQLException ex){
         System.out.println("ERROR:"+ ex.getMessage());     
    }
}
}
public void actualizar(){
    conexion con =new conexion();
   try{
       Connection cone =con.conexion();
        PreparedStatement ps=cone.prepareStatement("DELETE FROM producto WHERE cantidad<1");
        ps.executeUpdate();
   }catch(SQLException ex){
       
   }
}
public factura RetornarFactura(){

     conexion con = new conexion();
    factura fc =null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT cliente.*,factura.* FROM factura inner join cliente on factura.id_cliente=cliente.id_cliente");
        
        ResultSet ra=re.executeQuery();
        while(ra.next()){
           Clientes cl=new Clientes(ra.getString(1),ra.getString(2),ra.getString(3),ra.getString(4),ra.getString(5),ra.getString(6),ra.getInt(7));
           fc= new factura(cl,ra.getString(9),ra.getDouble(10),ra.getDouble(11),ra.getDouble(12),ra.getString(13),ra.getInt(14));
           
        }
        cone.close();
        return fc;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}

}
