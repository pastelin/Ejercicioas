package mx.com.gm.peliculas.datos;

import java.io.IOException;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

/**
 * Contiene las operaciones a ejecutar en el archivo de pelicula.txt
 *
 * @author Juan Pastelin Brioso
 * @version 1.0
 */
public interface AccesoDatos {
    
    public abstract boolean existe(String nombreArchivo);
    
    public abstract List<Pelicula> listar(String nombre) throws AccesoDatosEx, IOException;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx, IOException;
    
    public abstract String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx, IOException;
    
    public abstract void crear(String nombreArchivo) throws Exception;
    
    public abstract void borrar(String nombreArchivo);
    
    
}
