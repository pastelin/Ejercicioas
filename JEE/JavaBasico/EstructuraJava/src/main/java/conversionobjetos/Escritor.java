package conversionobjetos;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;
    
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
        
    }
    
    public String obtenerDetalles() {
        
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
        
    }
    
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto() {
        return this.tipoEscritura.getDescripcion();
    }
    
}
