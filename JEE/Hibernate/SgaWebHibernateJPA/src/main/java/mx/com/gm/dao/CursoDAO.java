package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Curso;

public class CursoDAO extends GenericDAO implements DatosGenericDAO<Curso> {

    @Override
    public List<Curso> listar() {
        String consulta = "SELECT c FROM Curso c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        
        return query.getResultList();
    }
    
    @Override
    public void insertar(Curso curso) {

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curso);
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
    public void modificar(Curso curso) {
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
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
    public Curso buscarPorId(Curso curso) {
        em = getEntityManager();
        return em.find(Curso.class, curso.getIdCurso());
    }
    
    @Override
    public void eliminar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(curso));
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
