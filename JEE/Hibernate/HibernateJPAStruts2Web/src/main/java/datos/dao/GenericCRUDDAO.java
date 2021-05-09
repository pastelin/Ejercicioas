package datos.dao;

import java.util.List;

/**
 *
 * Interface a que se hara referencia desde la capa de servicio para listar, 
 * insertar, eliminar, buscar y eliminar
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 * @param <T>
 */
public interface GenericCRUDDAO<T> {

    public abstract List<T> listar();
    
    public abstract void insertar(T t);

    public abstract void modificar(T t);
    
    public abstract void eliminar(T t);
    
    public abstract T buscarPorId(T t);
    
}
