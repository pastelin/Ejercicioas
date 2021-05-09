package datos.dao;

import domain.entity.Alumno;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

/**
 *
 * Clase que se encarga de realizar transacciones y consultas a la bd
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AlumnoDAO extends GenericEMDAO implements GenericCRUDDAO<Alumno> {

    Logger log = LogManager.getLogger(AlumnoDAO.class);

    @Override
    public List<Alumno> listar() {
        log.info("Iniciando el metodo listar de la clase AlumnoDAO de la capa de datos");

        String consulta = "SELECT a FROM Alumno a";
        Query query = null;

        this.em = getEntityManager();
        query = this.em.createQuery(consulta);

        return query.getResultList();
    }

    @Override
    public void insertar(Alumno alumno) {
        
        try {
            log.info("Iniciando el metodo insertar de la clase AlumnoDAO");
            this.em = getEntityManager();
            this.em.getTransaction().begin();

            this.em.persist(alumno);
            this.em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            this.em.getTransaction().rollback();
        }
        
        
    }

    @Override
    public void modificar(Alumno alumno) {
        log.info("Iniciando el metodo modificar de la clase AlumnoDAO de la capa de datos");
        
        try {
            this.em = getEntityManager();
            this.em.getTransaction().begin();
            
            this.em.merge(alumno);
            
            this.em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            this.em.getTransaction().rollback();
        }
    }

    @Override
    public void eliminar(Alumno alumno) {
        log.info("Iniciando el metodo eliminar de la clase AlumnoDAO de la capa de datos");

        try {
            this.em = getEntityManager();
            this.em.getTransaction().begin();
            
            this.em.remove(this.em.merge(alumno));
            
            this.em.getTransaction().commit();
        } catch(Exception ex) {
            ex.printStackTrace(System.out);
            this.em.getTransaction().rollback();
        }
    }

    @Override
    public Alumno buscarPorId(Alumno alumno) {
        this.em = getEntityManager();
        return this.em.find(Alumno.class, alumno.getIdAlumno());
    }

}
