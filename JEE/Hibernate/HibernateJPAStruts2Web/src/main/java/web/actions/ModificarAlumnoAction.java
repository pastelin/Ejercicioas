package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import domain.entity.Alumno;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;
import servicio.ServicioAlumno;

@Results({
    @Result(name="success", location="/WEB-INF/content/visualizarDatos.jsp"),
    @Result(name="modificacionExitosa", location="alumnos", type="redirectAction"),
    @Result(name="eliminacionExitosa", location="alumnos", type="redirectAction")
})
public class ModificarAlumnoAction extends ActionSupport {

    Logger log = LogManager.getLogger(ModificarAlumnoAction.class);
    
    private Integer id;
    private Alumno alumno;
    private ServicioAlumno servicioAlumno;
    
    @Action("verDatos")
    @Override
    public String execute() {
        log.info("Iniciando el metodo excute de la clase ModificarAlumnoAction");
        
        if(this.id != null) {
            servicioAlumno = new ServicioAlumno();
            alumno = new Alumno(this.id);
            alumno = servicioAlumno.buscarPorId(alumno);
        }
        return SUCCESS;
    }

    @Action("modificarAlumno")
    public String modificarAlumno() {
        log.info("Iniciando el metodo modificarAlumno de la clase ModificarAlumnoAction");
        
        servicioAlumno = new ServicioAlumno();
        servicioAlumno.modificar(alumno);
        
        return "modificacionExitosa";
    }
    
    @Action("eliminarAlumno")
    public String eliminarAlumno() {
        log.info("Iniciando el metodo eliminar de la clase ModificarAlumnoAction");
        
        servicioAlumno = new ServicioAlumno();
        servicioAlumno.eliminar(alumno);
        
        return "eliminacionExitosa";
    }
    
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
}
