package conversionobjetos;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public enum TipoEscritura {

    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
}
