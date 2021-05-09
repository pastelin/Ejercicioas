package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class EncontrarObjetoJAP {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
       
        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        // Objeto en estado transitivo
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecuta SQL de tipo SELECT
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina la transaccion
        tx.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto recuperado: " + persona1);
       
        //Cerramos el entity manager
        em.close();

    }
}
