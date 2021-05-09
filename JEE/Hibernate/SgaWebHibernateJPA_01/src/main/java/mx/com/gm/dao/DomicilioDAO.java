/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Domicilio;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class DomicilioDAO extends GenericDAO implements DatosGenericDAO<Domicilio> {

    @Override
    public List<Domicilio> listar() {
        String consulta = "SELECT d FROM Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        
        return query.getResultList();
    }
    
    @Override
    public void insertar(Domicilio domicilio) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
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
    public void modificar(Domicilio domicilio) {
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(domicilio);
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
    public Domicilio buscarPorId(Domicilio contacto) {
        em = getEntityManager();
        return em.find(Domicilio.class, contacto.getIdDomicilio());
    }
    
    @Override
    public void eliminar(Domicilio domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
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
