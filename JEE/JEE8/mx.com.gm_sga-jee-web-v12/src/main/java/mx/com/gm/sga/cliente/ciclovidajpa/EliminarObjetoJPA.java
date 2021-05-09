package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class EliminarObjetoJPA {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Inicia la transaccion
        //Paso 1. Inicia una transaccion 
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecuta SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina transaccion 1
        tx.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto encontrado: " + persona1);
        
        //Paso 4. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 5. Ejecuta SQL que es un delete
        em.remove(em.merge(persona1));
        
        //Paso 5. Termina transaccion 2
        tx2.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto encontrado: " + persona1);
        
    }
    
}
