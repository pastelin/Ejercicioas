package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ActualizarObjetoJPA {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Inicia la transaccion
        //Paso 1. Iniciar una transaccion
        // Objeto en estado transitivo
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //Paso 2. Ejecuta SQL de tipo select
        //El id proporsionado debe existir en la BD
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina la transaccion
        tx.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto recuperado: " + persona1);
       
        //Paso 4. setValue (nuevoValor)
        persona1.setApellido("Juarez");
        
        //Paso 5. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 5. Modificamos el objeto
        em.merge(persona1);
        
        //Paso 7. Termina transaccion 2
        tx2.commit();
        
        //Objeto en el estado detached
        log.debug("Objeto recuperado: " + persona1);
        
        //Cerramos el entity manager
        em.close();
        
    }
    
}
