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
public class Detalle_factura {
    
     private int cantidad;
    private int id_detalle_factura;
    private String nombre_producto;
    private String marca_producto;
    
    private factura factura;

    public Detalle_factura(int cantidad, int id_detalle_factura, String nombre_producto, String marca_producto, factura factura) {
        this.cantidad = cantidad;
        this.id_detalle_factura = id_detalle_factura;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.factura = factura;
    }

    public Detalle_factura(int cantidad, String nombre_producto, String marca_producto, factura factura) {
        this.cantidad = cantidad;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_detalle_factura() {
        return id_detalle_factura;
    }

    public void setId_detalle_factura(int id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public factura getFactura() {
        return factura;
    }

    public void setFactura(factura factura) {
        this.factura = factura;
    }

}
