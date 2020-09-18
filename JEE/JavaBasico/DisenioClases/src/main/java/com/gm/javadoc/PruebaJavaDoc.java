package com.gm.javadoc;

/**
 * Clase para probar el concepto de JavaDOc
 * @author Juan Pastelin
 * @version 1.0
 */
public class PruebaJavaDoc {
    
    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args es un arreglo de tipo String de la linea de comandos
     */
    public static void main(String[] args){
        
        Aritmetica aritmetica1 = new Aritmetica(3, 2);
        int resultado = aritmetica1.sumar();
        System.out.println("resultado = " + resultado);
        
    }
    
    
    
    
}
