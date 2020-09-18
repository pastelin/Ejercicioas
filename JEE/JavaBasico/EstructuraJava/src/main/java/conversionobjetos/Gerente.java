
package conversionobjetos;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class Gerente extends Empleado{

    private String deparatamento;
    
    public Gerente(String nombre, double sueldo, String departamento) {
        
        super(nombre, sueldo);
        this.deparatamento = departamento;
        
    }
    
    @Override
    public String obtenerDetalles() {
        
        return super.obtenerDetalles() + ", departamento: " + this.deparatamento;
        
    }
    
    public String getDepartamento() {
        return this.deparatamento;
    }
    
    public void setDepartamento(String departamento) {
        this.deparatamento = departamento;
    }
    
}
