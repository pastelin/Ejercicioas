package mx.com.gm.sga.cliente;

import java.util.*;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        
         System.out.println("Iniciando llamada al EJB desde el cliente \n");
         
         try {
             
             Context jndi = new InitialContext();
             PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServicioImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
             
             List<Persona> personas = personaService.listaPersonas();
             
             personas.forEach(persona -> {
                 System.out.println(persona);
             });
             
         } catch(NamingException ex) {
             
             ex.printStackTrace(System.out);
             
         }
        
    }
    
}
