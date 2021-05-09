package test;

import mx.com.gm.dao.PersonaDAO;
import org.com.gm.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(9);
        
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = " + persona);
        
//        persona.setNombre("Carlos");
//        persona.setApellido("Esparza");
//        persona.setEmail("cesparza@mail.com");
//        persona.setTelefono("15236547");

//        personaDao.insertar(persona);
        
//        personaDao.modificar(persona);

        personaDao.eliminar(persona);
        
        personaDao.listar();

    }
    
}
