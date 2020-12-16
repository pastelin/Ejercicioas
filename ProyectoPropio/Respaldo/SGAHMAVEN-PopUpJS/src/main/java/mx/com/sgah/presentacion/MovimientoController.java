package mx.com.sgah.presentacion;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.sgah.dominio.MovimientoDTO;
import mx.com.sgah.negocio.implementacion.CatalogoMovimientoImpl;
import mx.com.sgah.negocio.interfaz.CatalogoMovimientosDao;

/**
 *
 * @author paste
 */
@WebServlet(name = "MovimientoController", urlPatterns = {"/MovimientoController"})
public class MovimientoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Iniciando el servlet MovimientoController");

        // Declara e inicializa objeto de tipo CatalogMoviemientosDao
        CatalogoMovimientosDao catalogoMovimientosDao = new CatalogoMovimientoImpl();

        // Declara e inicializa lista de movimientos
        List<MovimientoDTO> listaMovimientos = new ArrayList();
        
        float total = 0;

        try {

            // Almacena el retorno del metodo listarMovimiento
            listaMovimientos = catalogoMovimientosDao.listarMovimiento();

            System.out.println(listaMovimientos);
            
            // Calcula el total de ahorro
            for (MovimientoDTO movimiento : listaMovimientos) {
                
                total += movimiento.getMonto();
                
            }
            
            System.out.println(total);
            
            // Almacena un atributo en el request, envia nombre del atributo y valor
            request.setAttribute("listaMovimientos", listaMovimientos);

            request.setAttribute("total", total);
            
        } catch (NullPointerException ex) {

            ex.printStackTrace(System.out);
            
        }

        // Almacena un objeto que actua como un envoltorio para el recurso asignado en el path
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/movimientos.jsp");
        // Envia una peticion de un servlet a un recurso
        dispatcher.forward(request, response);
    }

}
