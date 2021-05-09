package mx.com.sgah.presentacion;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.sgah.dominio.MovimientoDTO;
import mx.com.sgah.negocio.implementacion.CatalogoMovimientoImpl;
import mx.com.sgah.negocio.interfaz.CatalogoMovimientosDao;
import mx.com.sgah.negocio.localdateformatter.LocalDateFormatter;

/**
 *
 * @author paste
 */
@WebServlet(name = "MovimientoController", urlPatterns = {"/MovimientoController"})
public class MovimientoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Recupera el valor de la accion solicitada
        String accion = request.getParameter("accion");

        if (accion != null) {

            switch (accion) {

                case "editar":
                    this.editarMovimiento(request, response);
                    break;

                default:
                    this.accionDefault(request, response);

            }

        } else {

            this.accionDefault(request, response);

        }

    }

    private void editarMovimiento(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        // Recupera el valor del idMovimiento
        int idMovimiento = Integer.parseInt(request.getParameter("idMovimiento"));
        
        // Declaracion de objetos a utilizar
        CatalogoMovimientosDao catalogoMovimientosObj = new CatalogoMovimientoImpl();
        
        MovimientoDTO movimientoDTO = (MovimientoDTO) catalogoMovimientosObj.encontrar(new MovimientoDTO(idMovimiento));
        
        request.setAttribute("movimiento", movimientoDTO);
        
        String path = "WEB-INF/paginas/movimiento/editarMovimiento.jsp";
        
        request.getRequestDispatcher(path).forward(request, response);
        
    }
    
    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Declara e inicializa objetos y variables a utilizar
        CatalogoMovimientosDao catalogoMovimientosDao = new CatalogoMovimientoImpl();
        List<MovimientoDTO> listaMovimientos = new ArrayList();
        float total = 0, totalKeep = 0, totalFree = 0, totalBorrow = 0;

        // Almacena el retorno del metodo listarMovimiento
        listaMovimientos = catalogoMovimientosDao.listarMovimiento();

        // Calcula total de ahorro
        for (MovimientoDTO movimiento : listaMovimientos) {

            if (!movimiento.getAsignacion().equals("borrow")) {
                total += movimiento.getMonto();
            }

            if (movimiento.getAsignacion().equals("keep")) {
                totalKeep += movimiento.getMonto();
            }

            if (movimiento.getAsignacion().equals("free")) {
                totalFree += movimiento.getMonto();
            }

            if (movimiento.getAsignacion().equals("borrow")) {
                totalBorrow += movimiento.getMonto();
            }

        }

        // Crea y almacena valores en el scope Session
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaMovimientos", listaMovimientos);
        sesion.setAttribute("total", total);
        sesion.setAttribute("totalKeep", totalKeep - totalBorrow);
        sesion.setAttribute("totalFree", totalFree + totalBorrow);
        sesion.setAttribute("totalBorrow", totalBorrow);

        // Redirecciona a movimientos.jap
        // response.sendRedirect("jsp/movimientos.jsp");
        // Almacena un objeto que actua como un envoltorio para el recurso asignado en el path
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/movimientos.jsp");
        // Envia una peticion de un servlet a un recurso
        dispatcher.forward(request, response);

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Recupera el valor de la accion solicitada
        String accion = request.getParameter("accion");

        if (accion != null) {

            switch (accion) {

                case "insertarAhorro":
                    this.insertarAhorro(request, response);
                    break;
                case "insertarGasto":
                    this.insertarMovimiento(request, response, "free");
                    break;
                case "insertarPrestamo":
                    this.insertarMovimiento(request, response, "borrow");
                    break;
                case "modificar": 
                    this.modificarMovimiento(request, response);
                    break;
                default:
                    this.accionDefault(request, response);

            }

        } else {

            this.accionDefault(request, response);

        }

    }

    private void insertarAhorro(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Iniciando el servlet AhorroController");

        // Declaracion de objetos a utilizar
        CatalogoMovimientosDao catalogoMovimientosObj = new CatalogoMovimientoImpl();

        // Declaracion de varibles para almacenar los valores mandados del formulario
        float monto = Float.parseFloat(request.getParameter("monto"));
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");
        String asignacion = request.getParameter("asignacion");

        // Da formato a la fecha de entrada
        String fechaFormato = LocalDateFormatter.formatterDMY(fecha);

        // Crea un objeto con los datos del formulario
        MovimientoDTO movimientoObj = new MovimientoDTO(monto, fechaFormato, descripcion, "ahorro", asignacion);

        // Manda a llamar el metodo de la capa de negocio
        catalogoMovimientosObj.agregarMovimiento(movimientoObj);

        this.accionDefault(request, response);

    }

    private void insertarMovimiento(HttpServletRequest request, HttpServletResponse response, String asignacion)
            throws ServletException, IOException {

        System.out.println("Iniciando el servlet GastoController");

        // Declara e inicializa objetos a utilizar
        CatalogoMovimientosDao catalogoMovimientosObj = new CatalogoMovimientoImpl();

        // Declaracion de varibles para almacenar los valores mandados del formulario
        float monto = Float.parseFloat(request.getParameter("monto"));
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        // Da formato a la fecha de entrada
        String fechaFormato = LocalDateFormatter.formatterDMY(fecha);

        // Crea un objeto con los datos del formulario
        MovimientoDTO movimientoObj = new MovimientoDTO(monto, fechaFormato, descripcion, "gasto", asignacion);

        // Manda a llamar el metodo de la capa de negocio
        catalogoMovimientosObj.agregarMovimiento(movimientoObj);

        this.accionDefault(request, response);

    }
    
    private void modificarMovimiento(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Iniciando el metodo modificarMovimiento");

        // Declaracion de objetos a utilizar
        CatalogoMovimientosDao catalogoMovimientosObj = new CatalogoMovimientoImpl();

        // Declaracion de varibles para almacenar valores mandados del formulario
        int idMovimiento = Integer.parseInt(request.getParameter("idMovimiento"));
        float monto = Float.parseFloat(request.getParameter("monto"));
        float montoAnterior = Float.parseFloat(request.getParameter("montoAnterior"));
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");
        String tipoMovimiento = request.getParameter("tipoMovimiento");
        String asignacion = request.getParameter("asignacion");

        float montoNuevo = montoAnterior - monto;
        
        // Crea un objeto con los datos del formulario
        MovimientoDTO movimientoObj = new MovimientoDTO(idMovimiento ,montoNuevo, fecha, descripcion,tipoMovimiento, asignacion);

        // Manda a llamar el metodo de la capa de negocio
        catalogoMovimientosObj.actualizarMovimiento(movimientoObj);
        
        // Crea un objeto con los datos del formulario
        MovimientoDTO movimientoObj2 = new MovimientoDTO(monto, fecha, descripcion, "ahorro", "free");

        // Manda a llamar el metodo de la capa de negocio
        catalogoMovimientosObj.agregarMovimiento(movimientoObj2);


        this.accionDefault(request, response);

    }

}
