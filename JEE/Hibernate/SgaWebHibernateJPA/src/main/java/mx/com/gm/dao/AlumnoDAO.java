package mx.com.gm.dao;

import java.util.*;
import javax.persistence.*;
import mx.com.gm.domain.Alumno;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AlumnoDAO extends GenericDAO implements DatosGenericDAO<Alumno> {

    @Override
    public List<Alumno> listar() {
        String consulta = "SELECT a FROM Alumno a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        
        return query.getResultList();
    }
    
    @Override
    public void insertar(Alumno alumno) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } 
        catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
        finally {
            if(em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public void modificar(Alumno alumno) {
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        }
        catch(Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    @Override
    public Alumno buscarPorId(Alumno alumno) {
        em = getEntityManager();
        return em.find(Alumno.class, alumno.getIdAlumno());
    }
    
    @Override
    public void eliminar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        }
        catch(Exception ex) {
            ex.printStackTrace(System.out);
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
}
