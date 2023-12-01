package modelo;

import java.util.Date;

public class Producto {
    
    private int codProducto;
    private int codProveedor;
    private int codCategoria;
    private double precio;
    private String nombre;
    private Date fechaVencimiento;
    private int stock;
    
    public Producto (){
        this.codProducto = 0;
        this.codProveedor =0;
        this.codCategoria = 0;
        this.precio = 0.0;
        this.nombre = "";
        this.fechaVencimiento = new Date();
        this.stock = 0;
        
    }

    public Producto(int codProducto, int codProveedor, int codCategoria, double precio, String nombre, Date fechaVencimiento, int stock) {
        this.codProducto = codProducto;
        this.codProveedor = codProveedor;
        this.codCategoria = codCategoria;
        this.precio = precio;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.stock = stock;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
