package mx.com.sgah.negocio.localdateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que tiene como objetivo dar formato a las fechas
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class LocalDateFormatter {
    
  
    /**
     * Metodo que realizar el formateo de fecha
     * 
     * @param fecha String a dar formato
     * @return String cadena con la fecha en formato "dd/MM/yyyy"
     */
    public static String formatterDMY(String fecha) {
        
        System.out.println("Inicia el metodo formatterDMY");
        
        // Define variable con el formato a usar
        String formato = "dd/MM/yyyy";
        
        // Convierte la cadena recibida en una instancia de LocalDate
        LocalDate date = LocalDate.parse(fecha);
        
        // Crea objeto para poder imprimir el parseo del objeto LocalDate
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(formato);
        
        // Guarda el resultado del parseo
        String formatoSalida = dateFormatter.format(date);
        
        System.out.println("Formato de salida : " + formatoSalida );
        
        System.out.println("Fin del metodo formatterDMY");
        
        return formatoSalida;
        
    }
    

}
