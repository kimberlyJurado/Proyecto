/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.Producto;
import identidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class manty_Producto {

    public void Grabar(Producto pr){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO producto(nombre,marca,cantidad,precio, id_proveedor)VALUES(?,?,?,?,?)");
              re.setString(1, pr.getNombre()) ;
              re.setString(2, pr.getMarca());
              re.setInt(3,pr.getCantidad());
              re.setDouble(4, pr.getPrecio());
              re.setInt(5, pr.getProveedor().getId_proveedor());
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}

public Producto Consultar(String val){
    conexion con = new conexion();
    Producto pr = null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT producto.*,proveedor.* FROM producto inner join proveedor on producto.id_proveedor=proveedor.id_proveedor WHERE producto.nombre=?");
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            Proveedor pro= new Proveedor(ra.getString(7),ra.getString(8),ra.getString(9),ra.getString(10),ra.getString(11),ra.getInt(12));
            pr=new Producto(ra.getString(1),ra.getString(2),ra.getInt(3),ra.getDouble(4),ra.getInt(5),pro);
        
        }
        cone.close();
        return pr;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}
public void Modificar(Producto pr){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE producto SET nombre=?,marca=?,cantidad=?,precio=?, id_proveedor=? WHERE id_producto=?");
        re.setInt(6, pr.getId_producto());
        re.setString(1, pr.getNombre()) ;
              re.setString(2, pr.getMarca());
              re.setInt(3,pr.getCantidad());
              re.setDouble(4, pr.getPrecio());
              re.setInt(5, pr.getProveedor().getId_proveedor());
              re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
    }
}
public void Eliminar(int val){
    conexion con=new conexion();
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareStatement("DELETE FROM producto WHERE id_producto=?");
        re.setInt(1, val);
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }
}
}