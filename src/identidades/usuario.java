/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

/**
 *
 * @author Usuario
 */
public class usuario {
 
   
    private String nombre_usuario;
    private String contraseña;
     private int id_usuario;
    private String nivel;

    public usuario(String nombre_usuario, String contraseña, int id_usuario, String nivel) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.id_usuario = id_usuario;
        this.nivel = nivel;
    }

    public usuario(String nombre_usuario, String contraseña, String nivel) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.nivel = nivel;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
}
