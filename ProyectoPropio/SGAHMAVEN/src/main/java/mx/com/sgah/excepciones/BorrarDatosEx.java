package mx.com.sgah.excepciones;

/**
 * Clase que maneja excepcion al eliminar registros en bd
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class BorrarDatosEx extends AccesoDatosEx {

    /**
     * Constructor que recibe cadena con mensaje de excepcion
     * 
     * @param mensaje 
     */
    public BorrarDatosEx(String mensaje) {
        
        super(mensaje);
        
    }
    
}
