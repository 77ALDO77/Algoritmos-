package modelo;

public class Empleado {
    
    //Atributos
    private int codEmpleado;
    private int codEspecialidad;
    private String nombre;
    private String apellido;
    private int dni;
    private String correo;
    private int celular;
    
    public Empleado() {
        this.codEmpleado = 0;
        this.codEspecialidad = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.correo = "";
        this.celular = 0;
    }

    public Empleado(int codEmpleado, int codEspecialidad, String nombre, String apellido, int dni, String correo, int celular) {
        this.codEmpleado = codEmpleado;
        this.codEspecialidad = codEspecialidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
    }
    
    
    

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
}
