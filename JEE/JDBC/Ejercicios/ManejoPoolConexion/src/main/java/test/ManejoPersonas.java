package test;

import datos.*;
import domain.PersonaDTO;
import java.util.List;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ManejoPersonas {

    public static void main(String[] args) {
        
        PersonaDao personaDao = new PersonaDaoJDBC();
        
        List<PersonaDTO> personas = personaDao.select();
        
        personas.forEach( persona -> {
            System.out.println(persona);
        });
        
        // Prueba insert
//        PersonaDTO persona = new PersonaDTO();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("maria@gmail.com");
//        persona.setTelefono("1345678");
//        
//        personaJDBC.insert(persona);
        
        // Prueba update
//        PersonaDTO persona = new PersonaDTO();
//        persona.setIdPersona(4);
//        persona.setNombre("Mayra");
//        persona.setApellido("Perez");
//        persona.setEmail("maria@gmail.com");
//        persona.setTelefono("1345678");
//        
//        personaJDBC.update(persona);


        // Prueba delete
//        PersonaDTO persona = new PersonaDTO();
//        
//        persona.setIdPersona(3);
//
//        personaJDBC.delete(persona);
//
    }
    
}
