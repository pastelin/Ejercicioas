package mx.com.gm.peliculas.negocio;

/**
 * Contiene las operaiones necesarios de la aplicacion CatalogoPeliculas
 * 
 * @author Juan Psastelin
 * @version 1.0
 * 
 */
 
public interface CatalogoPeliculas {
    
    public abstract void agregarPelicula(String nombrePelicula, String nombreArchivo);
    
    public abstract void listartPaliculas(String nombreArchivo);
    
    public abstract void buscarPelicula(String nombreArchivo, String buscar);
    
    public abstract void iniciarArchivo(String nombreArchivo);
     
}
