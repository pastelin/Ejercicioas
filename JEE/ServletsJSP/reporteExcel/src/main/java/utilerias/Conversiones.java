package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Conversiones {

    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format(Date fecha) {
        
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        
        return formateador.format(fecha);
        
    }
    
    public static String format(String fecha) {
        
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        
        return formateador.format(fecha);
        
    }
    
}
