
package modelo;

public class DetalleVenta {
    
    //Atributos
    private int codDetalleVenta;
    private int codVenta;
    private int codProducto;
    //esta de mas
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private String tipoPago;
    private double totalPagar;
    
    
    public DetalleVenta() {
        this.codDetalleVenta = 0;
        this.codVenta = 0;
        this.codProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subTotal = 0.0;        
        this.totalPagar = 0.0;

    }

    public DetalleVenta(int codDetalleVenta, int codVenta, int codProducto, String nombre, int cantidad, double precioUnitario, double subTotal, double totalPagar) {
        this.codDetalleVenta = codDetalleVenta;
        this.codVenta = codVenta;
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.totalPagar = totalPagar;
    }



    public int getCodDetalleVenta() {
        return codDetalleVenta;
    }

    public void setCodDetalleVenta(int codDetalleVenta) {
        this.codDetalleVenta = codDetalleVenta;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    

    

    
}
