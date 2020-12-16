package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ManejoPersonas {

    public static void main(String[] args) {
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        
        List<Persona> personas = personaJDBC.select();
        
        personas.forEach( persona -> {
            System.out.println(persona);
        });
        
        // Prueba insert
//        Persona persona = new Persona();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("maria@gmail.com");
//        persona.setTelefono("1345678");
//        
//        personaJDBC.insert(persona);
        
        // Prueba update
//        Persona persona = new Persona();
//        persona.setIdPersona(4);
//        persona.setNombre("Mayra");
//        persona.setApellido("Perez");
//        persona.setEmail("maria@gmail.com");
//        persona.setTelefono("1345678");
//        
//        personaJDBC.update(persona);


        // Prueba delete
//        Persona persona = new Persona();
//        
//        persona.setIdPersona(3);
//
//        personaJDBC.delete(persona);
//
    }
    
}
