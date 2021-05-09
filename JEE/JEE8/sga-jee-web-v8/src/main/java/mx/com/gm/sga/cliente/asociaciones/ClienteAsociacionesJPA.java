package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ClienteAsociacionesJPA {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        em.close();
        
        //Imprimir los objetos de tipo persona
        for (Persona persona : personas) {
            log.debug("Persona: " + persona);
            for(Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
        
    }
    
}
