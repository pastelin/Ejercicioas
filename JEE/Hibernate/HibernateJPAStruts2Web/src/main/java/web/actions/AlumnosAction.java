package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import domain.entity.Alumno;
import java.util.*;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;
import servicio.ServicioAlumno;

/**
 *
 * Clase de tipo accion encargada de redireccionar al jsp listarAlumnos, y obtener 
 * una lista de alumnos hallados en la base de datos solicitandolo a la capa de servicio
 * @author Juan pastelin Brioso
 * @version 1.0
 */
@Result(name="success", location="/WEB-INF/content/listarAlumnos.jsp")
public class AlumnosAction extends ActionSupport {

    Logger log = LogManager.getLogger(AlumnosAction.class);
    private ServicioAlumno servicioAlumno;
    private List<Alumno> listaAlumnos;
    
    @Action("alumnos")
    @Override
    public String execute() {
        
        log.info("#ListarAlumnosActio.execute# : Redireccionando al jsp listar-alumnos");
        servicioAlumno = new ServicioAlumno();
        this.listaAlumnos = servicioAlumno.listar();
        return SUCCESS;
        
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

}
