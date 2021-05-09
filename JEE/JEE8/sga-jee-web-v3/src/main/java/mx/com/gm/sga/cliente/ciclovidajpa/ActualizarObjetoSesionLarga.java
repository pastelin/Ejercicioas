package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ActualizarObjetoSesionLarga {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        // Objeto en estado transitivo
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecutamos el SQL de tipo SELECT
        Persona persona1 = em.find(Persona.class, 1);
        
        //Objeto en el estado detached
        log.debug("Objeto recuperado: " + persona1);
        
        //Paso 3. setValue (nuevoValor)
        persona1.setEmail("jjuarez@gmail.com");
        
        //Paso 4. Termina la transaccion
        tx.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto recuperado: " + persona1);
        
        //Cerramos el entity manager
        em.close();
        
    }
    
}
