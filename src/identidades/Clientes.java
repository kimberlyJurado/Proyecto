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
public class Clientes {
    
    private String nombres;
    private String cedula;
    private String direccion;
      private String correo_electronico;
    private String apellidos;
    private String telefono;
     private int id_cliente;

    public Clientes(String nombres, String cedula, String direccion, String correo_electronico, String apellidos, String telefono, int id_cliente) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.id_cliente = id_cliente;
    }

    public Clientes(String nombres, String cedula, String direccion, String correo_electronico, String apellidos, String telefono){
        this.nombres = nombres;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

         
    }
