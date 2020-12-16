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
//    public static void main(String[] args){
//        
//        Aritmetica aritmetica1 = new Aritmetica(3, 2);
//        int resultado = aritmetica1.sumar();
//        System.out.println("resultado = " + resultado);
//        
//    }
    
    public static void main(String[] args) {

        String cadena = "MÉXICO";

        System.out.println(cambiarAcentos(cadena));

    }

    public static String cambiarAcentos(String descripcion) {

        char[] caracterConAcento = {'Á', 'É', 'Í', 'Ó', 'Ú', 'á', 'é', 'í', 'ó', 'ú'};

        char[] caracterSinAcento = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < descripcion.length(); i++) {

            char letra = descripcion.charAt(i);

            for (int j = 0; j < caracterConAcento.length; j++) {

                if (letra == caracterConAcento[j]) {

                    descripcion.replace(caracterConAcento[j], caracterSinAcento[j]);

                }

            }

        }

        return descripcion;
    }

    
    
}
