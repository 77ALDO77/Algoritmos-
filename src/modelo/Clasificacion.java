package modelo;

public class Clasificacion {
    
    private int codClasificacion;
    private String nombre;
    
    public Clasificacion(){
        this.codClasificacion = 0;
        this.nombre = "";
    }

    public Clasificacion(int codClasificacion, String nombre) {
        this.codClasificacion = codClasificacion;
        this.nombre = nombre;
    }

    public int getCodClasificacion() {
        return codClasificacion;
    }

    public void setCodClasificacion(int codClasificacion) {
        this.codClasificacion = codClasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
