package mx.com.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.dominio.Persona;

@Local
public interface PersonaService {

    public abstract List<Persona> listarPersonas();
    
}
