package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        // Indicamos el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls ");
        
        // Indica al navegador que no guarda cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        // Desplegamos informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
        
        
        
    }
    
    
    
}
