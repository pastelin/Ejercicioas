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
@WebServlet("SesionesServlet")
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        // Pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        // Si es nulo es la primera vez que accedemos a la aplicacion 
        if ( contadorVisitas == null ) {
            
            contadorVisitas = 1; 
            titulo = "Bienvenido por primera vez";
            
        } else {
            
            contadorVisitas++; 
            titulo = "Bienvenido nuevamente";
            
        }
        
        // Agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        // Mandamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        
        out.print(titulo);
        out.print("<br>");
        out.print("no. accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion : " + sesion.getId());
        out.close();
        
    }
    
}
