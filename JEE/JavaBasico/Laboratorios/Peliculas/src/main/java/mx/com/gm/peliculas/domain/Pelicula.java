package mx.com.gm.peliculas.domain;

/**
 * Representa los objetos pelicula utilizados en la aplicacion catalogo de 
 * peliculas
 * 
 * @author Juan Pastelin
 * @version 1.0
 */
public class Pelicula {
    
    private String nombre;
    
    public Pelicula() {
        
    }
    
    public Pelicula(String nombre) {
        
        this.nombre = nombre;
        
    }
    
    public String getNombre() {
        
        return this.nombre;
        
    }
    
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }
    
    @Override
    public String toString() {
        
        return "Pelicula {" + " nombre = "  +this.nombre + " }";
        
    }
    
}
