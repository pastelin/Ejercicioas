package mx.com.gm.dao;

import java.util.*;
import javax.persistence.*;
import org.com.gm.domain.Persona;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public List<Persona> listar() {
        String hql = "select p from Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
//        personas.forEach( p -> {System.out.println("Persona: " + p);} );
        return personas;
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
    }
    
    public Persona buscarPersonaPorId(Persona persona) {
        return em.find(Persona.class, persona);
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
