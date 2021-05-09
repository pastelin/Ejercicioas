package servicio;

import datos.dao.*;
import domain.entity.Alumno;
import java.util.*;
import org.apache.logging.log4j.*;

/**
 *
 * Clase que se encarga de la comunicacion entre la capa web con la capa de datos
 * para la entidad de Alumno, Contacto y Direccion
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class ServicioAlumno {

    Logger log = LogManager.getLogger(ServicioAlumno.class);
    
    private GenericCRUDDAO<Alumno> interfaceAlumnoDao;
    
    public List<Alumno> listar() {
        log.info("Iniciando el metodo listar de la clase ServicioAlumno de la capa de servicio");
        
        interfaceAlumnoDao = new AlumnoDAO();
        
        return interfaceAlumnoDao.listar();
    }
    
    public void insertar(Alumno alumno) {
        log.info("Iniciando el metodo insertar de la clase ServicioAlumno de la capa de servicio");
        
        interfaceAlumnoDao = new AlumnoDAO();
        
        interfaceAlumnoDao.insertar(alumno);
    }
    
    public Alumno buscarPorId(Alumno alumno) {
        log.info("Iniciando del metodo buscarPortId de la clase ServicioAlumno de la capa de servicio");
        
        interfaceAlumnoDao = new AlumnoDAO();
        
        return interfaceAlumnoDao.buscarPorId(alumno);
    }

    public void modificar(Alumno alumno) {
        log.info("Iniciando el metodo modificar de la clase ServicioAlumno de la capa de servicio");
        
        interfaceAlumnoDao = new AlumnoDAO();
        interfaceAlumnoDao.modificar(alumno);
    }
    
    public void eliminar(Alumno alumno) {
        log.info("Iniciando el metodo eliminar de la clase ServicioAlumno de la capa de servicio");
        
        interfaceAlumnoDao = new AlumnoDAO();
        interfaceAlumnoDao.eliminar(alumno);
    }
}
