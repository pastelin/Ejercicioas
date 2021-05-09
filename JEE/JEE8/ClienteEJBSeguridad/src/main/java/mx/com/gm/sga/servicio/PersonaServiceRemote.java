package mx.com.gm.sga.servicio;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

public interface PersonaServiceRemote {

    public abstract List<Persona> listaPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
