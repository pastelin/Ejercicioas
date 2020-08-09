
package exception.ejercicio01;

public class EjercicioTest {

    public static void main(String[] args) {
        
        int var = 3;
        
        switch(var){
            
            case 1:
                try{
                    throw new IllegalArgumentException();
                }catch(RuntimeException e){
                    e.printStackTrace();
                }
                
            default: 
                try{
                    throw new ArrayIndexOutOfBoundsException();
                }catch(RuntimeException e){
                    e.printStackTrace();
                }
            
            case 2
                    :
                try{
                    throw new ArithmeticException();
                    
                }catch(RuntimeException e){
                    e.printStackTrace();
                }
            
        }
        
    }

    
}
