package mx.com.datos;

import java.util.List;
import mx.com.dominio.Persona;

public interface PersonaDatosDao {

    public abstract List<Persona> listarPersonas();
    
}
