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
public class Factura {
    
    private Cliente cliente;
    private int fecha_emision;
   private int  subtotal;
   private int  iva;
    private int total;
    private String nombre_vendedor;
    private int id_factura;
    private Producto producto;

    public Factura(Cliente cliente, int fecha_emision, int subtotal, int iva, int total, String nombre_vendedor, int id_factura, Producto producto) {
        this.cliente = cliente;
        this.fecha_emision = fecha_emision;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.nombre_vendedor = nombre_vendedor;
        this.id_factura = id_factura;
        this.producto = producto;
    }

    public Factura(Cliente cliente, int fecha_emision, int subtotal, int iva, int total, String nombre_vendedor, Producto producto) {
        this.cliente = cliente;
        this.fecha_emision = fecha_emision;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.nombre_vendedor = nombre_vendedor;
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(int fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }    
}
