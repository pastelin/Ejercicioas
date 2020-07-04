package classdesign.lambdas;

import java.util.List;

@FunctionalInterface
public interface PruebaLambda {
    
    public static int count = 0;
    
    public abstract List<String> addName();
  
    public default void printNames(List<String> listaName){
    
         for(String name : listaName){
             
             System.out.println("Nombre: " + name);
             
         }
        
    }
    
     default void message(int num){
        
        System.out.println("Hola, desde la interface");
        
    }
    
    
}
