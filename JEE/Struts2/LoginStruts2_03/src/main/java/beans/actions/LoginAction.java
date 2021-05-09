package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

//@Result(name="success", location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport{

    Logger log = LogManager.getLogger(LoginAction.class);
    
//    @Action("login")
    @Override
    public String execute() {
        
        log.info("Iniciando la clase LoginAction");
        
        return SUCCESS;
        
    }
    
}
