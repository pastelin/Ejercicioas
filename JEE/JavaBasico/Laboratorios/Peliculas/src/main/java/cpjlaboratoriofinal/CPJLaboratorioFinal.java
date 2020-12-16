package cpjlaboratoriofinal;

import java.util.InputMismatchException;
import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

/**
 * Contiene el menu que permite al usuario seleccionar la accion a ejecutar 
 * sobre el catalogo de peliculas
 * 
 * @author Juan Pastelin
 * @version 1.0
 */
public class CPJLaboratorioFinal {
    
    
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        String nombrePelicula, nombreBusqueda;
        String nombreArchivo = "c:\\Cursos\\Archivos\\peliculas.txt";
        CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
        
        
        do {
            
            try {
                
                menu();
                
                opcion = entrada.nextInt();
                
                switch( opcion ) {

                    case 1: 
                        
                       System.out.println("Se esta creando el archivo");
                       
                       catalogo.iniciarArchivo(nombreArchivo);

                        break;

                    case 2: 
                        
                        System.out.println("Ingrese el nombre de la pelicula");
                        
                        nombrePelicula = entrada2.nextLine();
                        
                        catalogo.agregarPelicula(nombrePelicula, nombreArchivo);

                        break;

                    case 3: 
                        
                        System.out.println("*** Lista de peliculas ***");
                        
                        catalogo.listartPaliculas(nombreArchivo);
                        
                        System.out.println("***************************");

                        break;

                    case 4:
                        
                        System.out.println("Ingrese el nombre de la pelicula a buscar");
                        
                        nombreBusqueda = entrada2.nextLine();
                        
                        catalogo.buscarPelicula(nombreArchivo, nombreBusqueda);
                        
                        

                        break;

                    case 0: 
                        bandera = false;
                        break;

                    default : 
                        System.out.println("Intente de nuevo, introduzca una opcion valida");

                }
            } catch (InputMismatchException ex) {
                
                System.out.println("Intente de nuevo, introduzca una opcion valida");
                entrada.next();
                bandera = true;
                
            }
            
        } while( bandera != false );
        
    }
    
    public static void menu() {
        
        StringBuilder sp = new StringBuilder();
        
        sp.append("Elige una opcion: \n");
        sp.append("1.- Iniciar catalogo peliculas \n");
        sp.append("2.- Agregar pelicula \n");
        sp.append("3.- Listar peliculas \n");
        sp.append("4.- Buscar pelicula \n");
        sp.append("0.- Salir \n");
        
        System.out.println(sp.toString());
        
    }
    
}
