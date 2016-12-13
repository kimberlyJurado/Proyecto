/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Mante_Proveedor {
    
    public void Grabar(Proveedor pv){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO proveedor(nombre,cedula,telefono, direccion, email)VALUES(?,?,?,?,?)");
              re.setString(1,pv.getNombre());
              re.setString(2,pv.getCedula());
              re.setString(3,pv.getDireccion());
              re.setString(4,pv.getEmail());
              re.setString(5,pv.getTelefono());
              
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}
    public Proveedor Consultar(String val){
    conexion con = new conexion();
  Proveedor pv=null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM proveedor WHERE cedula=?");
        re.setString(1, val);
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            pv=new Proveedor(ra.getString(1),ra.getString(2),ra.getString(3),ra.getString(4),ra.getString(5),ra.getInt(6));
        }
        cone.close();
        return pv;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}
public void Modificar(Proveedor pv){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE proveedor SET id_proveedor=?,nombre=?,cedula=?,telefono=?, direccion=?, email=? WHERE id_proveedor=?");
        re.setInt(6, pv.getId_proveedor());
        re.setString(1,pv.getNombre());
        re.setString(2,pv.getCedula());
        re.setString(3,pv.getDireccion());
        re.setString(4,pv.getEmail());
        re.setString(5,pv.getTelefono());
       
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
        PreparedStatement re=cone.prepareStatement("DELETE FROM proveedor WHERE id_proveedor=?");
        re.setInt(1, val);
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }
}
}
