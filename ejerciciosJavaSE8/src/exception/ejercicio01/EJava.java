
package exception.ejercicio01;

public class EJava {

    void method(){
        
        try{
            guru();
            return;
        }finally{
            System.out.println("finally 1");
        }
        
    }
    
    void guru(){
        
        System.out.println("guru");
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        
        
        EJava var = new EJava();
        var.method();
        
    }
}
