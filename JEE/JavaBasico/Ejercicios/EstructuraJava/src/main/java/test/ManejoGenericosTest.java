package test;

import generics.ClaseGenerica;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ManejoGenericosTest {

    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
    
        objetoInt.obtenerTipo(); 
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Hola");
        
        objetoString.obtenerTipo();
    }
    
}
