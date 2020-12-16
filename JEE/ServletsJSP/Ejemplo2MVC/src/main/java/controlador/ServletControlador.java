package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Procesamos parametros
        String accion = request.getParameter("accion");
        
        // 2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(2, 3);
        Rectangulo recAplicacion = new Rectangulo(4,5);
        
        // 3. Agregamos el javabean en algun alcance
        
        // Revisamos la accion proporcionada 
        if ("agregaVariables".equals(accion)) {
            
            // Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            
            // Alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            
            // Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplicacion", recAplicacion);
            
            // Agregamos una mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            // 4. Redireccionamos al inicio
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else if ("listarVariables".equals(accion)) {
            
            // 4. Redireccionamos al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
            
        } else {
            
            // 4. Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
       
        
        // 4. Redireccionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
        
    }
    
}
