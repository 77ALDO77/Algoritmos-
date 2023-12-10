
package modelo;

import java.util.Date;


public class FichaMedica {
    
    //Atributos
    private int codFicha;
    private int codPaciente;
    private byte[] examenes;
    private String alergias;
    private Date fecha_visita;
    private String diagnostico;
    private String tratamiento;

        
    public FichaMedica() {
        this.codFicha = 0;
        this.codPaciente = 0;
        this.examenes = new byte[0];
        this.alergias = "";
        this.fecha_visita = new Date();
        this.diagnostico = "";
        this.tratamiento = "";
    }

    public FichaMedica(int codFicha, int codPaciente, byte[] examenes, String alergias, Date fecha_visita, String diagnostico, String tratamiento) {
        this.codFicha = codFicha;
        this.codPaciente = codPaciente;
        this.examenes = examenes;
        this.alergias = alergias;
        this.fecha_visita = fecha_visita;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public int getCodFicha() {
        return codFicha;
    }

    public void setCodFicha(int codFicha) {
        this.codFicha = codFicha;
    }

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public byte[] getExamenes() {
        return examenes;
    }

    public void setExamenes(byte[] examenes) {
        this.examenes = examenes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Date getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(Date fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setRutaArchivoPDF(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    

    
    
    
}
