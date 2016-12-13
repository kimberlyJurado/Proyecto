/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import identidades.Cliente;
import com.demo.ui.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Manteni_Cliente {
    
    public Cliente Consultar(String val){
    conexion con = new conexion();
    Cliente cl =null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM cliente WHERE cedula=?");
        re.setString(1, val);
        ResultSet ra=re.executeQuery();
        while(ra.next()){
            cl= new Cliente(ra.getString(1),ra.getString(2),ra.getString(3),ra.getString(4),ra.getString(5),ra.getString(6),ra.getInt(7));
        }
        cone.close();
        return cl;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
    }
    
    public void Eliminar(int val){
        conexion con=new conexion();
        try{
            Connection cone=con.conexion();
            PreparedStatement re=cone.prepareStatement("DELETE FROM cliente WHERE id_cliente=?");
            re.setInt(1, val);
            re.executeUpdate();
            cone.close();
        }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());  
        }
    }
    public void Modificar(Cliente cl){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE cliente SET nombres=?,cedula=?,direccion=?,correo_electronico=?,apellidos=?,telefono=? WHERE id_cliente=?");
            re.setInt(7,cl.getId_cliente());
            re.setString(1,cl.getNombres());
            re.setString(2,cl.getCedula());
            re.setString(3,cl.getDireccion());
            re.setString(4,cl.getCorreo_electronico());
            re.setString(5,cl.getApellidos());
            re.setString(6,cl.getTelefono());
            re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
    }
    }
    
    public void Grabar(Cliente cl){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO cliente(nombres,cedula,direccion,correo_electronico,apellidos,telefono)VALUES(?,?,?,?,?,?)");
              re.setString(1,cl.getNombres());
              re.setString(2,cl.getCedula());
              re.setString(3,cl.getDireccion());
              re.setString(4,cl.getCorreo_electronico());
              re.setString(5, cl.getApellidos());
              re.setString(6,cl.getTelefono());
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }
}
    
}