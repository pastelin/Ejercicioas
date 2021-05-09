package mx.com.gm.sga.servicio;

import java.util.*;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mx.com.gm.sga.domain.Persona;
import mx.com.sga.datos.PersonaDao;

@Stateless
//@WebService(endpointInterface = "mx.com.gm.sga.servicio.PersonaServiceWs")
public class PersonaServicioImpl implements PersonaService{

    @Inject
    PersonaDao personaDao;
    
    @Resource
    private SessionContext contexto;
    
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
        
        try {
            personaDao.updatePersona(persona);
        } catch(Throwable t) {
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

//    @Override
//    public List<Persona> listarPersona() {
//        return personaDao.findAllpersonas();
//    }

    
    
}
