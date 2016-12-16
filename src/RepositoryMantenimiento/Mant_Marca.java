/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.Marca;
import identidades.Producto;
import identidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Mant_Marca {
    
    public void Grabar(Marca ma){
    conexion con= new conexion();
    
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO marca(nombre)VALUES(?)");
              re.setString(1,ma.getNombre());
   
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}
    public Marca Consultar(String val){
    conexion con = new conexion();
    Marca ma=null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM marca WHERE nombre=?");
        re.setString(1, val);
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            ma=new Marca(ra.getString(1),ra.getInt(2));
        }
        cone.close();
        return ma;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}
public void Modificar(Marca ma){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE marca SET nombre=? WHERE id_nombre=?");
       
        re.setInt(2,ma.getId_nombre());
        re.setString(1,ma.getNombre());
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
        PreparedStatement re=cone.prepareStatement("DELETE FROM marca WHERE id_nombre=?");
        re.setInt(1, val);
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }
}
public List<Marca> ObtenerMarca(){
    
      conexion con = new conexion();
      List<Marca> Marcas=new ArrayList<Marca>();
 
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM marca");
       
        ResultSet ra=re.executeQuery();
        while(ra.next()){
           Marca ma=new Marca(ra.getString(1),ra.getInt(2));
            Marcas.add(ma);
        }
        cone.close();
        return Marcas;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
}
}
}