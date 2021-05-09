package testclientews;

import clientews.servicio.*;
import java.util.List;

public class TestPersonaServiceWs {

    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServicioImplService().getPersonaServicioImplPort();
        
        System.out.println("Ejecutando servicio listar persona ws");
        
        List<Persona> personas = personaService.listarPersona();
        
        for (Persona persona : personas) {
            System.out.println("Persona idPersona: " + persona.getIdPersona());
        }
        
        System.out.println("Fin servicio listar personas");
    }
    
    
}
