package mx.com.sga.datos;

import java.util.*;
import mx.com.gm.sga.domain.Persona;

public interface PersonaDao {

    public List<Persona> findAllpersonas();
    
    public Persona findPersonaByid(Persona persona);
    
    public Persona findPersonaByEmail(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
    
}
