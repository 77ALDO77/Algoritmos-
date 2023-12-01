
package modelo;


public class Login {
    
    private int codUsuario;
    private String nombre;
    private String clave;


    public Login() {
        this.codUsuario = 0;
        this.nombre = "";
        this.clave = "";
    }
    
    

        public int getCodUsuario() {
            return codUsuario;
        }

        public void setCodUsuario(int codUsuario) {
            this.codUsuario = codUsuario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }
    
    
}
