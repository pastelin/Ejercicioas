package test;

import java.util.*;
import javax.persistence.*;
import org.com.gm.domain.Persona;

public class HolaMundoHibernate {

    public static void main(String[] arg) {
        
        String hql = "select p from Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
    
        personas.forEach( p -> { System.out.println("Persona: " + p); } );
        
    }
    
}
