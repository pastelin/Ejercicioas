package test;

public class EjemploVarArgs {

    public static void main(String[] args){
        
        // Imprimimos varios numeros
        imprimirNumeros(15,1,4,6);
        
        // Parametros variables
        System.out.println("");
        variosParametros("Juan", true, 14, 2, 5);
        
    }
    
    private static void variosParametros(String nombre, boolean bandera, int... numeros){
        
        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);
        
        for(int i = 0; i < numeros.length; i++){
            
            System.out.println("elemento = " + numeros[i]);
            
        }
    }
    
    
    private static void imprimirNumeros(int... numeros){
        
        // Recorremos cada elemento del arreglo
        for(int i = 0; i < numeros.length; i++){
            
            System.out.println("elemento " + numeros[i]);
            
        }
        
    }
    
    
}
