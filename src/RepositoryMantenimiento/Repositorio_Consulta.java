/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryMantenimiento;

import com.demo.ui.conexion;
import identidades.Detalle_factura;
import identidades.consulta_f;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Repositorio_Consulta {
    
    public List<consulta_f> Buscar(String sql){
    List<consulta_f> lco= new ArrayList<consulta_f>();
    conexion con=new conexion();
    try{
    Connection conex=con.conexion();
        PreparedStatement pst=conex.prepareCall(sql);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
           consulta_f pq=new consulta_f(rs.getInt(1),rs.getString(8),rs.getString(6),rs.getString(5)+" "+rs.getString(4),rs.getDouble(7));
         lco.add(pq);
         
        }
       return lco;
    }
    catch(SQLException ex){
        System.out.println(ex.getMessage());
        return null;
    }
    
}
}