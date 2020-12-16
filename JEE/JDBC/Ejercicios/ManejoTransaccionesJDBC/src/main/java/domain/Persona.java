package domain;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Persona {

    private int id_persona;
    private String nombre;
    private String apellido;
    private String email; 
    private String telefono;
    
    public int getIdPersona() {
        return this.id_persona;
    }
    
    public void setIdPersona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        
        return "Persona {" + " id_persona=" + this.id_persona + " nombre=" + 
                this.nombre + " apellido=" + this.apellido + " email=" + this.email + 
                " telefono=" + this.telefono + "}";
        
    }
    
    
}
