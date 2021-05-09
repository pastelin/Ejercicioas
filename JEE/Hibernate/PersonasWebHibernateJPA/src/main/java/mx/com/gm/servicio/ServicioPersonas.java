package mx.com.gm.servicio;

import java.util.*;
import mx.com.gm.dao.PersonaDao;
import org.com.gm.domain.Persona;

public class ServicioPersonas {

    private PersonaDao personaDao;
    
    public ServicioPersonas() {
        this.personaDao = new PersonaDao();
    }
    
    public List<Persona> listartPersona() {
        return this.personaDao.listar();
    }
    
    
}
