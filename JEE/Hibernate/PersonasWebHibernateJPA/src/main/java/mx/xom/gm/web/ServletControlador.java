package mx.xom.gm.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.servicio.ServicioPersonas;
import org.com.gm.domain.Persona;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {
            ServicioPersonas servicioPersonas = new ServicioPersonas();
            
            List<Persona> personas = servicioPersonas.listartPersona();
            
            request.setAttribute("personas", personas);
            
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
