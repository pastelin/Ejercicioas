package prcticashacker;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class CambioAcentos {

    
    public static void main(String[] args) {
        
        String cadena = "ÁÉÍÓÚáéíóú";
        
        System.out.println(cambiarAcentos(cadena));
        
    }
    
    
    public static String cambiarAcentos(String descripcion) {
        
        char[] caracterConAcento = {'Á', 'É', 'Í', 'Ó', 'Ú', 'á', 'é', 'í', 'ó', 'ú'};
        
        char[] caracterSinAcento = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        
        String nuevaDescripcion = null;
        
        for ( int i = 0; i < descripcion.length(); i++ ) {
            
            char letra = descripcion.charAt(i);
            
            for ( int j = 0; j < caracterConAcento.length; j++ ) {
                
                if ( letra == caracterConAcento[j] ) {
                    
                    nuevaDescripcion =  descripcion.replace(caracterConAcento[j], caracterSinAcento[j]);
                    
                    descripcion = nuevaDescripcion;
                    
                }
                
            }
            
        }
        
        return descripcion;
    }
    
}
