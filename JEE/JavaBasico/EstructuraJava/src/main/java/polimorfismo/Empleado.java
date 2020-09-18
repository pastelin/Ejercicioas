package polimorfismo;

/**
 * Esta clase define los valores de los atributos nombre y sueldo de la clase
 * padre al igual que los metodos setters y getters.
 *
 * @author Juan Pastelin
 * @version 1.0
 */

public class Empleado {

    // Primer atributo protegido
    protected String nombre;
    
    // Segundo atributo protegido
    protected double sueldo;
    
    /**
     * Constructor pretegido que recibe dos parametros
     * @param nombre contienen el valor del nombre
     * @param sueldo  cntiene el valor del sueldo
     */
    public Empleado(String nombre, double sueldo) {
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }
    
    /**
     * Este metodo muestra los datos del nombre y sueldo
     * @return String
     */
    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }
    
    /**
     * @return String contiene el valor del nombre 
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Metodo que asigna el valor recibido al atributo nombre de la clase
     * 
     * @param nombre contiene el valor del nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return double contiene el valor del sueldo
     */
    public double getSueldo() {
        return this.sueldo;
    }
    
    /**
     * Metodo que asigna el valor recibido al atributo sueldo de la clase
     * 
     * @param sueldo contiene el valor del sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
