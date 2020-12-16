package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

/**
 * Implementa el metodo de las operaciones a ejecutar en el archivo pelicula.txt
 *
 * @author Juan Pastelin
 * @version 1.0
 */
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx, IOException {
        
        List<Pelicula> listaPeliculas = new ArrayList();
        
        File archivo = new File(nombre);
        
        BufferedReader entrada = new BufferedReader( new FileReader(archivo) );
        
        String namePelicula = entrada.readLine();
        
        while ( namePelicula != null ) {
            
            Pelicula pelicula = new Pelicula(namePelicula);
            
            listaPeliculas.add(pelicula);
            
            namePelicula = entrada.readLine();
            
        }
        
        entrada.close();
        
        return listaPeliculas;
        
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx, IOException {
        
        File archivo = new File(nombreArchivo);
        
        PrintWriter salida = new PrintWriter( new FileWriter(archivo, anexar) );
        salida.println(pelicula.getNombre());
        salida.close();
        
        System.out.println("Se ha escrito correctamente el archivo");
        
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx, IOException {
        
        String nombrePelicula = "";
        
        List<Pelicula> listaPeliculas = new ArrayList();
        
        listaPeliculas = listar(nombreArchivo);
        
        for (int i = 0; i < listaPeliculas.size(); i++) {
            
            String nombre = listaPeliculas.get(i).getNombre();
            
            if ( nombre.equals(buscar) ) {
                
                nombrePelicula = nombre;
                break;
                
            } else {
                
                nombrePelicula = "";
                
            }
                
        }
      
        return nombrePelicula;
        
    }

    @Override
    public void crear(String nombreArchivo) throws Exception {

        File archivo = new File(nombreArchivo);

        PrintWriter salida = new PrintWriter(archivo);

        System.out.println("Archivo creado exitosamente!!");

        salida.close();

    }

    @Override
    public void borrar(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
