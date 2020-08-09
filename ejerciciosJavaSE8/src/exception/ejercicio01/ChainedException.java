package exception.ejercicio01;

import javax.management.RuntimeErrorException;

public class ChainedException {

    public static void foo(){
        
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException oob){
            RuntimeException re = new RuntimeException(oob);
            re.initCause(oob);
            throw re;
        }
        
    }
    
    public static void main(String[] args) {
        try{
            foo();
        }catch(Exception re){
            System.out.println(re.getClass());
        }
    }
    
}
