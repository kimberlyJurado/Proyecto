/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.Vendedor;
import identidades.usuario;
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
public class Mante_Vendedor {
    
    public void Grabar(Vendedor ve){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO vendedor(nombre,cedula,telefono, email,usuario)VALUES(?,?,?,?,?)");
              
              re.setString(1,ve.getNombre());
              re.setString(2,ve.getCedula());
              re.setString(3,ve.getTelefono());
              re.setString(4,ve.getEmail());
             re.setInt(5, ve.getUsuario().getId_usuario());
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}

public Vendedor Consultar(String val){
    conexion con = new conexion();
    Vendedor ve=null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT vendedor.*,usuario.* FROM vendedor inner join usuario on vendedor.usuario=usuario.id_usuario WHERE vendedor.cedula=?");
       re.setString(1, val);
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            usuario usa=new usuario(ra.getString(7),ra.getString(8),ra.getInt(9),ra.getString(10));
            ve=new Vendedor(ra.getString(1),ra.getString(2),ra.getString(3),usa,ra.getInt(5),ra.getString(6));
        }
        cone.close();
        return ve;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}
public void Modificar(Vendedor ve){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE vendedor SET nombre=?,cedula=?,telefono=?, email=?,usuario=? WHERE id_vendedor=?");
         re.setInt(6,ve.getId_vendedor());
        re.setString(1,ve.getNombre());
        re.setString(2,ve.getCedula());
        re.setString(3,ve.getEmail());
        re.setInt(5,ve.getUsuario().getId_usuario());
        re.setString(4,ve.getTelefono());
        
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
        PreparedStatement re=cone.prepareStatement("DELETE FROM vendedor WHERE id_vendedor=?");
        re.setInt(1, val);
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }
}

public List<Vendedor> ObtenerVendedores(){
    
    conexion con = new conexion();
    List<Vendedor> Vendedores=new ArrayList<Vendedor>();
    
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT vendedor.*,usuario.* FROM vendedor inner join usuario on vendedor.usuario=usuario.id_usuario");
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            usuario usa=new usuario(ra.getString(7),ra.getString(8),ra.getInt(9),ra.getString(10));
           Vendedor ve=new Vendedor(ra.getString(1),ra.getString(2),ra.getString(3),usa,ra.getInt(5),ra.getString(6));
        Vendedores.add(ve);
        }
        cone.close();
        return Vendedores;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
}
}
}
