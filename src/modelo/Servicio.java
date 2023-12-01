package modelo;

public class Servicio {
    
    private int codServicio;
    private int codClasificacion;
    private String descripcion;
    private double precio;
    
    public Servicio (){
        this.codServicio = 0;
        this.codClasificacion = 0;
        this.descripcion = "";
        this.precio = 0.0;
    }

    public Servicio(int codServicio, int codClasificacion, String descripcion, double precio) {
        this.codServicio = codServicio;
        this.codClasificacion = codClasificacion;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }

    public int getCodClasificacion() {
        return codClasificacion;
    }

    public void setCodClasificacion(int codClasificacion) {
        this.codClasificacion = codClasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
