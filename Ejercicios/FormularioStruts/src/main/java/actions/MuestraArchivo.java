/*
* Clase 
*
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;


//@Namespace(value = "/descarga")
//@Action(value = "muestraArchivo", results = 
//        {
//            @Result(type = "stream", params =
//            {
//            
//            "contentType", "aplication/pdf",
//            "contentDisposition","attachment;file=\"CabecerosRespuesta.pdf\""
//
//            })
//        })

public class MuestraArchivo extends ActionSupport {

    private InputStream inputStream;

    @Override
    public String execute() throws Exception {
        
        String ruta = ServletActionContext.getServletContext().getRealPath("/CabecerosRespuesta.pdf");
        
        inputStream = new FileInputStream(ruta);
        
        return SUCCESS;
        
    }
    
    public InputStream getInputStream() {

        return inputStream;

    }    

}
