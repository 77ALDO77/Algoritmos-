package modelo;

public class Especialidad {
    
    
    private int codEspecialidad;
    private String nombre;
    
    public Especialidad (){
       this.codEspecialidad = 0; 
       this.nombre = "";
    }

    public Especialidad(int codEspecialidad, String nombre) {
        this.codEspecialidad = codEspecialidad;
        this.nombre = nombre;
    }
    
    

    public int getCodEspecialidad() {
        return codEspecialidad;
    }

    public void setCodEspecialidad(int codEspecialidad) {
        this.codEspecialidad = codEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
