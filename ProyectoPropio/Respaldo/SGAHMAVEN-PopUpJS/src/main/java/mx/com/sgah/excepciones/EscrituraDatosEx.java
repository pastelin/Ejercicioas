package mx.com.sgah.excepciones;

/**
 * Clase que maneja excepcion al insertar datos en bd
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class EscrituraDatosEx extends AccesoDatosEx {

    /**
     * Constructor que recibe cadena con mensaje de la excepcion
     *
     * @param mensaje
     */
    public EscrituraDatosEx(String mensaje) {

        super(mensaje);

    }

}
