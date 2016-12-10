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
public class Producto {
    
    private int id_producto;
    
    private String nombre;
    private String marca;
    private int cantidad;
    private int precio;
    
    private Proveedor proveedor;

    public Producto(int id_producto, String nombre, String marca, int cantidad, int precio, Proveedor proveedor) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public Producto(String nombre, String marca, int cantidad, int precio, Proveedor proveedor) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
        this.proveedor = proveedor;
    }
    
}
