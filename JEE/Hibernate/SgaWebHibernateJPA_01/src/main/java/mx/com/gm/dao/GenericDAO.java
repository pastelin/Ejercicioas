package mx.com.gm.dao;

import javax.persistence.*;

public abstract class GenericDAO {

    protected static EntityManager em;
    protected static EntityManagerFactory emf;
    protected static final String PU = "HibernateJpaPU";
    
    public GenericDAO() {
        if (this.emf == null) {
            this.emf = Persistence.createEntityManagerFactory(PU);
        }
    }

    protected EntityManager getEntityManager() {
        if (this.em == null) {
            this.em = emf.createEntityManager();
        }
        return em;
    }
    
}
