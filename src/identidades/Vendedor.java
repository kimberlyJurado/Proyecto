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
    private int cedula;
    private String email;
    private int usuario;
    private int id_vendedor;
    private int telefono;

    public Vendedor(String nombre, int cedula, String email, int usuario, int id_vendedor, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.usuario = usuario;
        this.id_vendedor = id_vendedor;
        this.telefono = telefono;
    }

    public Vendedor(String nombre, int cedula, String email, int usuario, int telefono) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
}
