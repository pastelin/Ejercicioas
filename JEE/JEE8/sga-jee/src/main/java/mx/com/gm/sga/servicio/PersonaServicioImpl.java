package mx.com.gm.sga.servicio;

import java.util.*;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServicioImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listaPersonas() {
        
        List<Persona> personas = new ArrayList();
        personas.add(new Persona(1, "juan", "perez", "juan@gmail.com", "123456798"));
        personas.add(new Persona(1, "pepe", "paz", "pepe@gmail.com", "12346579"));
        
        return personas;
        
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }

    
    
}
