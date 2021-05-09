package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String user;
    private String password;
    
    @Override
    public String execute() {
        
        
        log.info("El usuario ingresado es: " + this.user);
        log.info("La contraseña ingresada es: " + this.password);
        
        if ("admin".equals(this.user)) {
            return SUCCESS;
        }
        else {
            return INPUT;
        }
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
