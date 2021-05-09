package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Contacto;

public class ContactoDAO extends GenericDAO implements DatosGenericDAO<Contacto> {

    @Override
    public List<Contacto> listar() {
        String consulta = "SELECT c FROM Contacto c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        
        return query.getResultList();
    }
    
    @Override
    public void insertar(Contacto contacto) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
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
    public void modificar(Contacto contacto) {
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contacto);
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
    public Contacto buscarPorId(Contacto contacto) {
        em = getEntityManager();
        return em.find(Contacto.class, contacto.getIdContacto());
    }
    
    @Override
    public void eliminar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
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
