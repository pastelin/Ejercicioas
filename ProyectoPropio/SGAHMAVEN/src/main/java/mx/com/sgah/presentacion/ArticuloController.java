package mx.com.sgah.presentacion;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
@WebServlet(name = "ArticuloController", urlPatterns = {"/ArticuloController"})
public class ArticuloController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        System.out.println("Iniciando el servlet ArticuloController");
        
        // Almacena un objeto que actua oomo un envoltorio para el recurso asignado en el path
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/articulos.jsp");
        // Envia una peticion de un serler a un recurso
        dispatcher.forward(request, response);
        
    }
    
}
