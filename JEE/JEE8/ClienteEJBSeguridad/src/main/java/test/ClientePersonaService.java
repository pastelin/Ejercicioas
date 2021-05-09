package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.*;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        
        System.out.println("Iniciando llamada al EJB desde el cliente");
        
        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        
        try {
            
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web-v12/PersonaServicioImpl!mx.com.gm.sga.servicio.PersonaServiceRemotee");
            
            List<Persona> personas = personaService.listaPersonas();
            
            personas.forEach( p -> { System.out.println("Persona" + p); } );
            
            System.out.println("\n Fin llamada EJB desde el cliente");
            
        } catch(NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
