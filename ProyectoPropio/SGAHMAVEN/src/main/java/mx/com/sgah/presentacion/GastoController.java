/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.sgah.presentacion;

import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;
import mx.com.sgah.dominio.MovimientoDTO;
import mx.com.sgah.negocio.implementacion.CatalogoMovimientoImpl;
import mx.com.sgah.negocio.interfaz.CatalogoMovimientosDao;
import mx.com.sgah.negocio.localdateformatter.LocalDateFormatter;

/**
 *
 * @author paste
 */
@WebServlet(name = "GastoController", urlPatterns = {"/GastoController"})
public class GastoController extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Iniciando el servlet GastoController");

        // Declara e inicializa objetos a utilizar
        CatalogoMovimientosDao catalogoMovimientosObj = new CatalogoMovimientoImpl();
        List<MovimientoDTO> listaMovimientos = new ArrayList();
        float total = 0;

        // Declaracion de varibles para almacenar los valores mandados del formulario
        float monto = Float.parseFloat(request.getParameter("monto"));
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        // Da formato a la fecha de entrada
        String fechaFormato = LocalDateFormatter.formatterDMY(fecha);

        // Crea un objeto con los datos del formulario
        MovimientoDTO movimientoObj = new MovimientoDTO(monto, fechaFormato, descripcion, "gasto");

        // Manda a llamar el metodo de la capa de negocio
        catalogoMovimientosObj.agregarMovimiento(movimientoObj);

        listaMovimientos = catalogoMovimientosObj.listarMovimiento();

        // Calcula el total de ahorro
        for (MovimientoDTO movimiento : listaMovimientos) {

            total += movimiento.getMonto();

        }

        // Almacena el retorno del metodo listarMovimiento
        request.setAttribute("listaMovimientos", listaMovimientos);
        request.setAttribute("total", total);

        // Almacena un objeto que actua como un envoltorio para el recurso asignado en el path
        RequestDispatcher dispatcher = request.getRequestDispatcher("movimientos.jsp");
        // Envia una peticion de un servlet a un recurso
        dispatcher.forward(request, response);

    }

}
