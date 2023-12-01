package modelo;

public class Proveedor {
    
    private int codProveedor;
    private String nombre;
    private String contacto;
    private String pais;
    
    public Proveedor (){
        
        this.codProveedor = 0;
        this.nombre = "";
        this.contacto= "";
        this.pais = "";
        
    }

    public Proveedor(int codProveedor, String nombre, String contacto, String pais) {
        this.codProveedor = codProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.pais = pais;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    
    
}
