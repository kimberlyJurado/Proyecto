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
public class Vendedor {
    
    private String nombre;
    private String cedula;
    private String email;
   private usuario usuario;
    private int id_vendedor;
    private String telefono;

    public Vendedor(String nombre, String cedula, String email, usuario usuario, int id_vendedor, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.usuario = usuario;
        this.id_vendedor = id_vendedor;
        this.telefono = telefono;
    }

    public Vendedor(String nombre, String cedula, String email, usuario usuario, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.usuario = usuario;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
