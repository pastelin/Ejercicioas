package mx.com.gm.dao;

import java.util.List;

public interface DatosGenericDAO<T> {

    public abstract List<T> listar();
    
    public abstract void insertar(T t);
    
    public abstract void modificar(T t);
    
    public abstract void eliminar(T t);
    
    public abstract T buscarPorId(T t);
    
}
