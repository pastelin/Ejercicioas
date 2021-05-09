package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;

public class DownloadAction extends ActionSupport{

    private InputStream inputStream;
    
    public InputStream getInputStream(){
        
        return this.inputStream;
        
    }
    
    public String execute() throws Exception{
        
        String ruta = ServletActionContext.getServletContext().getRealPath("/CabecerosRespuesta.pdf");
        
        inputStream = new FileInputStream(ruta);
        
        return SUCCESS;
    }
    
    
}
