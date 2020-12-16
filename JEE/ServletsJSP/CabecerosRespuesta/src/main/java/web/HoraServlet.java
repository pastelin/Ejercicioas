package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {

    protected void deGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);  
        
        PrintWriter out = response.getWriter();
        out.print("Hora actualizada: " + horaConFormato);
        out.close();
        
    }
    
}
