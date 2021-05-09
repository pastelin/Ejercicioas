package mx.com.gm.sga.servicio;

import java.util.*;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Persona;
import mx.com.sga.datos.PersonaDao;

@Stateless
public class PersonaServicioImpl implements PersonaService{

    @Inject
    PersonaDao personaDao;
    
    @Override
    public List<Persona> listaPersonas() {        
        return personaDao.findAllpersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaByid(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

    
    
}
