package exception.ejercicio01;


public class Exceptions {

    void myMethod()throws ExceptionInInitializerError{
    
        System.out.println("base");
    
    }
    
}

class EJavaDeriveded extends Exceptions{
    
    void myMethod() throws RuntimeException{
    
        System.out.println("derived");
    
    }
    
}

class EJava3{
    
    public static void main(String[] args) {
        
        Exceptions obj = new EJavaDeriveded();
        obj.myMethod();
        
    }
}

