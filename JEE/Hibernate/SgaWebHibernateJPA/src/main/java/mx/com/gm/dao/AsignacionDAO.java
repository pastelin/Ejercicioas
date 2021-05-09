/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Asignacion;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AsignacionDAO extends GenericDAO implements DatosGenericDAO<Asignacion> {

    @Override
    public List<Asignacion> listar() {
        String consulta = "SELECT a FROM Asignacion a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        
        return query.getResultList();
    }
    
    @Override
    public void insertar(Asignacion asignacion) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(asignacion);
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
    public void modificar(Asignacion asignacion) {
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(asignacion);
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
    public Asignacion buscarPorId(Asignacion asignacion) {
        em = getEntityManager();
        return em.find(Asignacion.class, asignacion.getIdAsignacion());
    }
    
    @Override
    public void eliminar(Asignacion asignacion) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(asignacion));
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
