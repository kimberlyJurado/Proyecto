/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.ui;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class conexion {
 
  
   public Connection conexion(){
        Connection conex= null;
   String cadena ="jdbc:postgresql://localhost:5432/Kia";
   String user="postgres";
   String pass="1234";
   try{
       Class.forName(("org.postgresql.Driver"));
       conex=DriverManager.getConnection(cadena,user,pass);
   }catch(Exception exc){
       System.out.println("Error:"+exc.getMessage());
   }
   return conex;
   }
}
