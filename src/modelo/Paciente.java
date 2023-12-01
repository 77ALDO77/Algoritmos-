package modelo;

import java.util.Date;


public class Paciente {
    
    //Atributos
    private int codPaciente;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private int dni;
    private int celular;
    private String sexo;
    
    public Paciente() {
        this.codPaciente = 0;
        this.nombre = "";
        this.apellido = "";
        this.fecha_nacimiento = new Date();
        this.dni = 0;
        this.celular = 0;
        this.sexo = "";
    }

    public Paciente(int codPaciente, String nombre, String apellido, Date fecha_nacimiento, int dni, int celular, String sexo) {
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dni = dni;
        this.celular = celular;
        this.sexo = sexo;
    }
    
    

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
