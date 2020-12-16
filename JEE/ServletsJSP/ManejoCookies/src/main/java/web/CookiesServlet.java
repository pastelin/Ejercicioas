
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        // Suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsurio = true;
        
        // Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
     
        // Buscamos si existe una cookie creada con anterioridad llamada visitanteRecurrente
        if ( cookies != null ) {
        
            for ( Cookie c : cookies ) {

                if ( c.getName().equals("visitanteRecurrante") && c.getValue().equals("si") ) {

                    // Si ya existe la cookie es un usuario recurrente
                    nuevoUsurio = false;
                    break;

                }

            }
            
        }
        
        String mensaje = null;
        
        if ( nuevoUsurio ) {
            
            Cookie visitanteCookie = new Cookie("visitanteRecurrante", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
            
        } else {
            
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
            
        }
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.print(mensaje);
        out.close();
        
        
    }
    
}
