package beans.actions;

import org.apache.logging.log4j.*;

public class SaludarAction {

    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;
    
    public String execute() {
        
        log.info("Ejecutando el metodo execute de la clase HolaMundoAction");
        
        this.saludosAtr = "Bienvenido practica con Convenciones";
        
        return "exito";
        
    }
    
    public String getSaludosAtr() {
        return this.saludosAtr;
    }
    
    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
}
