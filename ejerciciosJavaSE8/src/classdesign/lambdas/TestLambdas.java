
package classdesign.lambdas;

import java.util.*;


public class TestLambdas {

    public static void main(String[] args) {
    
        PruebaLambdaConcreta pruebaLambda = new PruebaLambdaConcreta();
         
        /* Prueba sin lambda*/
        List<String> pr2 = pruebaLambda.addName();
        pruebaLambda.printNames(pr2);
        

        /* Prueba con lambda  */ 
        PruebaLambda prueba = () -> Arrays.asList("juan");
        List<String> pr = prueba.addName();
        pruebaLambda.printNames(pr);
        
    }
    
    
    
}
