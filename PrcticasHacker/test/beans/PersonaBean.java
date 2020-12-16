package beans;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class PersonaBean {

    private String nombre;
    private int edad;
    
    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;
    }
    
    public PersonaBean() {
        
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
