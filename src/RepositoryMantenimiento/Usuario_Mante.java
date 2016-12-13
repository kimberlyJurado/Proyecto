/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Usuario_Mante {
    
    public void Grabar(){
    conexion con= new conexion();
        try{
            Connection cone=con.conexion();
              PreparedStatement re=cone.prepareStatement("INSERT INTO usuario(nombre_usuario,contraseña,nivel)VALUES(?,?,?)");
              re.setString(1, txtNombre.getText());
              re.setString(2, txtContraseña.getText());
              re.setString(3, cbNivel.getSelectedItem().toString());
              re.executeUpdate();
        cone.close();
        }catch(SQLException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }

    }
public usuario Consultar(String val){
    conexion con = new conexion();
    usuario us=null;
    try{
        Connection cone=con.conexion();
        PreparedStatement re=cone.prepareCall("SELECT * FROM usuario WHERE nombre_usuario=?");
        re.setString(1, val);
        ResultSet ra=re.executeQuery();
        while(ra.next()){
        us=new usuario(ra.getString(1),ra.getString(2),ra.getInt(3),ra.getString(4));    
        }
        cone.close();
        return us;
    }catch(SQLException ex){
        System.out.println("ERROR: "+ex.getMessage());
        return null;
    }
}
public void Modificar(usuario us){
    conexion con= new conexion();
    try{
        Connection cone =con.conexion();
        PreparedStatement re=cone.prepareStatement("UPDATE usuario SET id_usuario=?,nombre_usuario=?,contraseña=?,nivel=? WHERE id_usuario=?");
        re.setInt(3,us.getId_usuario());
        re.setString(1,us.getNombre_usuario());
        re.setString(2,us.getContraseña());
       re.setString(4,us.getNivel());
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
        PreparedStatement re=cone.prepareStatement("DELETE FROM usuario WHERE id_usuario=?");
        re.setInt(1, val);
        re.executeUpdate();
        cone.close();
    }catch(SQLException ex){
      System.out.println("ERROR: "+ex.getMessage());  
    }

}
}
