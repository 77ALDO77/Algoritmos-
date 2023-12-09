
package modelo;

public class Venta {
    
    private int codVenta;
    private int codPaciente;
    private int codEmpleado;
    private String fecha;
    private double total;

    public Venta (){
        this.codVenta = 0;
        this.codPaciente =0;
        this.codEmpleado = 0;
        this.fecha = "";
        this.total = 0.0;
    }

    public Venta(int codVenta, int codPaciente, int codEmpleado, String fecha, double total) {
        this.codVenta = codVenta;
        this.codPaciente = codPaciente;
        this.codEmpleado = codEmpleado;
        this.fecha = fecha;
        this.total = total;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
