package mx.com.gm.peliculas.negocio;

import java.io.IOException;
import java.util.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

/**
 * Contiene las implementacioes de las operaciones necesarias de la aplicacion
 * CatalogoPeliculas
 *
 * @author Juan Pastelin
 * @version 1.0
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    public CatalogoPeliculasImpl() {

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {

        try {

            AccesoDatos accesoDatos = new AccesoDatosImpl();

            Pelicula pelicula = new Pelicula(nombrePelicula);

            accesoDatos.escribir(pelicula, nombreArchivo, true);

        } catch (EscrituraDatosEx | IOException ex) {

            ex.printStackTrace(System.out);

        }

    }

    @Override
    public void listartPaliculas(String nombreArchivo) {

        try {

            List<Pelicula> listaPeliculas = new ArrayList();

            AccesoDatos accesoDatos = new AccesoDatosImpl();

            listaPeliculas = accesoDatos.listar(nombreArchivo);

            for (Pelicula nombre : listaPeliculas) {

                System.out.println(nombre.getNombre());

            }

        } catch (LecturaDatosEx | IOException ex) {

            ex.printStackTrace(System.out);

        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

        try {

            AccesoDatos accesoDatos = new AccesoDatosImpl();

            String nombrePelicula = accesoDatos.buscar(nombreArchivo, buscar);
            
            if ( !nombrePelicula.equals("") ) {
                
                System.out.println("Pelicula: " + nombrePelicula);
                
            } else {
                
                System.out.println("El nombre de la pelicula no existe");
                
            }

        } catch (LecturaDatosEx | IOException ex) {
            
            ex.printStackTrace(System.out);
            
        }

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {

        try {

            AccesoDatos accesoDatos = new AccesoDatosImpl();

            accesoDatos.crear(nombreArchivo);

        } catch (Exception ex) {

            ex.printStackTrace(System.out);

        }

    }

}
