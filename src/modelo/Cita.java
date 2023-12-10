package modelo;

import java.util.Date;

public class Cita {

    private int codPaciente;
    private int codDoctor;
    private int codServicio;
    private int codArea;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private Date fecha_cita;
    private int dni;
    private int celular;
    private int cantidad;
    private String sexo;
    private String area;
    private String doctor;
    private String servicio;
    private String hora;

    public Cita() {
        this.codPaciente = 0;
        this.codDoctor = 0;
        this.codArea = 0;
        this.codServicio = 0;
        this.nombre = "";
        this.apellido = "";
        this.fecha_nacimiento = new Date();
        this.fecha_cita = new Date();
        this.dni = 0;
        this.celular = 0;
        this.cantidad = 1;
        this.sexo = "";
        this.hora = "";
        this.area = "";
        this.doctor = "";
        this.servicio = "";
    }

    public Cita(int codPaciente, int codDoctor, int codArea, int codServicio, int cantidad,
            String nombre, String hora, String apellido, Date fecha_nacimiento, 
            String area, Date fecha_cita, String doctor, String servicio,
            int dni, int celular, String sexo) {
        this.codPaciente = codPaciente;
        this.codDoctor = codDoctor;
        this.codServicio = codServicio;
        this.codArea = codServicio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_cita = fecha_cita;
        this.dni = dni;
        this.celular = celular;
        this.hora = hora;
        this.cantidad = cantidad;
        this.sexo = sexo;
        this.area = area;
        this.doctor = doctor;
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public int getCodArea() {
        return codArea;
    }
    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }
    public int getCodServicio() {
        return codServicio;
    }
    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }
    public int getCodDoctor() {
        return codDoctor;
    }
    public void setCodDoctor(int codDoctor) {
        this.codDoctor = codDoctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

}
