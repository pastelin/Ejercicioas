package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import mx.com.gm.model.Persona;
import org.apache.logging.log4j.*;

/**
 *
 * Clase de tipo accion encargada de redireccionar al jsp listarAlumnos y obtener
 * la lista de alumnos mediante la capta de servicio
 * 
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class PersonasAction extends ActionSupport {

    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;
    
    @Override
    public String execute() {
        
        log.info("Iniciando el metodo execute de la clase PersonasAction");
        
        if (this.persona != null) {
            log.info("\n");
            log.info("persona: " + this.persona);
        }
        else {
            log.info("Persona con valor nulo");
        }
        
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
