package modelo;

public class Area {
    
    //Atributos
    private int codArea;
    private String nombre;
    
    public Area() {
        this.codArea = 0;
        this.nombre = "";
    }
    
    public Area(int codArea, String nombre){
        this.codArea = codArea;
        this.nombre = nombre;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
