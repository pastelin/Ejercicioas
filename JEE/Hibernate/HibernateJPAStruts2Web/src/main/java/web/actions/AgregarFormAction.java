package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import domain.entity.Alumno;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;
import servicio.ServicioAlumno;

/**
 *
 * Clase de tipo accion encargada de redireccionar al jsp agregarAlumno, obtener 
 * los valores para la entidad de alumno, domicilio y contacto para agregar el 
 * registro nuevo
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@Results({
    @Result(name="exito", location="alumnos", type="redirectAction")
})
public class AgregarFormAction extends ActionSupport {

    private static Logger log = LogManager.getLogger(AgregarFormAction.class);
    private Alumno alumno;
    private ServicioAlumno servicioAlumno;
    
    @Override
    public String execute() {
        log.info("Iniciando el metodo execute de la clase AgregarAction");
        return SUCCESS;
    }
    
    @Action("agregarAlumno")
    public String agregarAlumno() {
        log.info("Iniciando el metodo agregarAlumno de la clase AgregarAction");
        
        if(this.alumno != null) {
            servicioAlumno = new ServicioAlumno();
            servicioAlumno.insertar(alumno);
        }
        return "exito";
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
}
