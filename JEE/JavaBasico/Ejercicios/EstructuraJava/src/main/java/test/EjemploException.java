package test;

import excepciones.Division;
import excepciones.OperacionExcepcion;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class EjemploException {

    public static void main(String[] args) {
        
        try{
            
            Division division = new Division(10, 0);
            
        } catch(OperacionExcepcion ex) {
            
            ex.getMessage();
            
        }
        
    }
   
}
