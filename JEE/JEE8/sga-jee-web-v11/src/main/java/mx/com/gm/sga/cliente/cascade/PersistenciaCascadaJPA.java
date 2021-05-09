package mx.com.gm.sga.cliente.cascade;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 1.Crea nuevo objeto
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Hector", "H", "hh@gmail.com", "123456");
        
        //Crea objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("hhp", "1324", persona1);
        
        //Paso 3. Persistimos el objeto usuario unicamente
        em.persist(usuario1);
        
        //Paso 4. Commit transaccion
        tx.commit();
        
        //Objetos en estado detached
        log.debug("Objeto persistido persona: " + persona1);
        log.debug("Objeto persistido usuario: " + usuario1);
        
    }
    
}
