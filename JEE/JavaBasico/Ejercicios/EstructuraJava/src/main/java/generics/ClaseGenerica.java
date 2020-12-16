package generics;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ClaseGenerica<T> {

    // Definimos la variable de tipo Generico
    T objeto;
    
    // Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto) {
        
        this.objeto = objeto;
        
    }
    
    public void obtenerTipo() {
        
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    
    }
    
}
