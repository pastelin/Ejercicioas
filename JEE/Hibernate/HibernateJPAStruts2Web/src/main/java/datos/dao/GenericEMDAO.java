package datos.dao;

import javax.persistence.*;

/**
 *
 * Clase abstracta que se encarga de crear EntityManagerFactory y EntityManager
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public abstract class GenericEMDAO {

    protected EntityManagerFactory emf;
    protected EntityManager em;
    protected static final String PU = "HibernateStrutsPU";
    
    public GenericEMDAO() {
        if (this.emf == null) {
            this.emf = Persistence.createEntityManagerFactory(PU); 
        }
    }
    
    protected EntityManager getEntityManager() {
        if(em == null) {
            this.em = emf.createEntityManager();
        }
        return this.em;
    }
    
}
