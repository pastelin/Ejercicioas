package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
@WebServlet("CarritoServlet")
public class CarritoServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        // Creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();
        
        // Recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = ( List<String> ) sesion.getAttribute("articulos");
        
        // Verificamos si la lista de articulos existe
        if ( articulos == null ) {
            
            // Inicializamos la lista de articulos 
            articulos = new ArrayList();
            sesion.setAttribute("articulos", articulos);
            
        }
        
        // Procesamos el nuevo parametro 
        String articuloNuevo = request.getParameter("articulo");
        
        // Revisamos y agregamos el articulo nuevo
        if ( articuloNuevo != null && !articuloNuevo.trim().equals("") ) {
            
            articulos.add(articuloNuevo);
            
        }
        
        // Imprimimos la lista de articulos
        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de Articulos</h1>");
        out.print("<br>");
        // Iteramos los articulos
        for ( String articulo : articulos ) {
            
            out.print("<li>" + articulo + "</li>");
            
        }
        
        // Agregamos un link para regresar al inicio
        out.print("<br>");
        out.print("<a href='/EjemploCarritoCompras'> Regresar al inicio </a>");
        
    }
    

}
