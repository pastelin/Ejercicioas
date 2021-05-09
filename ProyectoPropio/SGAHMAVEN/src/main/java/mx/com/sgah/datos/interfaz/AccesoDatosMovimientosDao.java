package mx.com.sgah.datos.interfaz;

import java.util.List;
import mx.com.sgah.excepciones.AccesoDatosEx;

/**
 * Contiene las operaciones a ejecutar en base de datos
 *
 * @author Juan pastelin Brioso
 * @version 1.1
 * @param <T>
 */
public interface AccesoDatosMovimientosDao<T> {

    /**
     * Agrega registros a bd
     *
     * @param t objeto a agregar
     * @return int numero de filas afectadas
     * @throws mx.com.sgah.excepciones.AccesoDatosEx
     */
    public abstract int agregar(T t) throws AccesoDatosEx;

    /**
     * Actualiza registros a bd
     *
     * @param t objeto a actualizar
     * @return int numero de registros afectados
     * @throws mx.com.sgah.excepciones.AccesoDatosEx
     */
    public abstract int actualizar(T t) throws AccesoDatosEx;

    /**
     * Elimina registros a bd
     *
     * @param t objeto a eliminar
     * @return int numero de registros afectados
     * @throws mx.com.sgah.excepciones.AccesoDatosEx
     */
    public abstract int eliminar(T t) throws AccesoDatosEx;

    /**
     * Lista todos los registros de bd
     *
     * @return lista de registros hallados
     * @throws mx.com.sgah.excepciones.AccesoDatosEx
     */
    public abstract List<T> listar() throws AccesoDatosEx;

    /**
     * Lista el registro que coincida con el id
     *
     * @param t objeto a buscar
     * @return lista de registro hallado
     * @throws mx.com.sgah.excepciones.AccesoDatosEx
     */
    public abstract T encontrar(T t) throws AccesoDatosEx;

  
    
}
