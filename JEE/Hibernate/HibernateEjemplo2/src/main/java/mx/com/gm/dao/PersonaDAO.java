package mx.com.gm.dao;

import java.util.*;
import javax.persistence.*;
import org.com.gm.domain.Persona;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void listar() {
        String hql = "select p from Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        personas.forEach( p -> { System.out.println("Persona: " + p); });
    }
    
    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
        
    }
    
    public Persona buscarPersonaPorId(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
    
    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        
    }
}
