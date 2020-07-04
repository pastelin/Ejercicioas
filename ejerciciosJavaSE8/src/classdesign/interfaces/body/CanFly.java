package classdesign.interfaces.body;

public interface CanFly {
    
    public final String type = "A";
    
    
    default String getType(){
        System.out.println("Hi with default");
        return type;
    }
    
    static String getType2(){
        System.out.println("Hi with static");
        return type;
    }
    
    
}

class Prueba implements CanFly{
    
    public static void main(String[] args) {
        
       Prueba prueba = new Prueba();
       prueba.getType();
       
       CanFly.getType2();
        
    }
    
}
