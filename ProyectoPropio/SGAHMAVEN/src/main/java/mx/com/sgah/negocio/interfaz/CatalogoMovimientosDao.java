package mx.com.sgah.negocio.interfaz;

import java.util.List;


/**
 * Contiene las operaiones necesarias de la aplicacion CatalogoMovimientos
 * 
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 * @param <T> de tipo generic
 */
public interface CatalogoMovimientosDao<T> {

    /**
     * Metodo abstracto que llama al metodo agregar de la capa de datos
     * 
     * @param t generica para usarse en distintas implementaciones
     * @return int con numero de filas afectadas
     */
    public abstract int agregarMovimiento(T t);
    
    /**
     * Metodo abstracto para llamar al metodo de  actualizar registros en bd
     * 
     * @param t
     * @return int en numero de filas afectadas
     */
    public abstract int actualizarMovimiento(T t);
    
    /**
     * Metodo abstracto para llamar al metodo de  listar registros en bd
     * 
     * @return lista de registros encontrados en bd 
     */
    public abstract List<T> listarMovimiento();
    
    /**
     * Metodo abstracto para llamar al metodo de  encontrar registro en bd
     * 
     * @param t
     * @return lista de registros encontrados en bd 
     */
    public abstract T encontrar(T t);
    
    
}
