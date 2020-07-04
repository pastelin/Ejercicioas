
package exceptions.practica1;

import java.util.*;

public class ThrowsException extends MyException{

    
    public static void main(String[] args) {
        
        Integer num = null;
       
        try{
            
            if(num == null){
                
                throw new MyException("Esta es mi excepcion personalizada");
                
            }else{
                
                nullPointer(num);
                
            }
            
        }
        
        catch(MyException e){
            
            System.out.println(e);
            
        }
        
        catch(NullPointerException ex){
            
            System.out.println(ex.getMessage());
            
        }
        
        
        
        
    }
    
    public static void nullPointer(int number){
       
    }

    
    
}
