
package coreapi.comparacion.string.ejemplo1;


public class Ejemplo1 {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hola");
        
        String a = sb.toString();
        String b = a;
        String c = new String("hola");
        
        
        System.out.println(a == b);
        
    }
    
}
