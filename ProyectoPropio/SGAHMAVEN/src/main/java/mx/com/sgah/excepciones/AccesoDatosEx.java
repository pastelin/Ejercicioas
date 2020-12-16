package mx.com.sgah.excepciones;

import java.sql.SQLException;

/**
 * Clase padre de excepciones al realizar operaciones en bd
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AccesoDatosEx extends SQLException {

    /**
     * Constructor que recibe cadena con mensaje de la excepcion
     *
     * @param mensaje
     */
    public AccesoDatosEx(String mensaje) {

        super(mensaje);

    }

}
