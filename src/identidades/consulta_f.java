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
public class consulta_f {
    
  private  int id_factura;
  private String FechaEmision;
  private String Vendedor;
  private String Producto;
  private double Total;

    public consulta_f(int id_factura, String FechaEmision, String Vendedor, String Producto, double Total) {
        this.id_factura = id_factura;
        this.FechaEmision = FechaEmision;
        this.Vendedor = Vendedor;
        this.Producto = Producto;
        this.Total = Total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
   
}
