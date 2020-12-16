package mx.com.sgah.excepciones;

/**
 * Clase que maneja excepcion al consultar datos en bd
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class LecturaDatosEx extends AccesoDatosEx {

    /**
     * Constructor que recibe cadena con mensaje de la excepcion
     *
     * @param mensaje
     */
    public LecturaDatosEx(String mensaje) {

        super(mensaje);

    }

}
