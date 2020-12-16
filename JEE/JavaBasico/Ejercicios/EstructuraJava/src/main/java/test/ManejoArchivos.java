package test;

import static archivos.Archivo.*;

public class ManejoArchivos {
    
    public static void main(String[] args) {
        
        String nombreArchivo = "c:\\Cursos\\Archivos\\archivoPruebaJava.txt" ;
        
        // Creamos un archivo
        //crearArchivo(nombreArchivo);
        
        // Escribir a archivo
        //escribirArchivo(nombreArchivo);
        
        // Mostrar informacion archivo
        //leerArchivo(nombreArchivo);
        
        // Anexar informacion archivo
        anexarArchivo(nombreArchivo);
        
        leerArchivo(nombreArchivo);
        
    }
    
    
}
