
package classdesign.overridevsoverload;

public  class OverrideVsOverload {
    
    public void getName(){
        System.out.println("Prueba");
    }
    
    public void getAge(){
        System.out.println("Prueba");
    }
    
}

class Practica1 extends OverrideVsOverload{
    
    public void getName(){
        
        System.out.println("Prueba2");
        
    }
    
     String getAge(String a){
        System.out.println("Prueba2");
        return a;
    }
    
    public static void main(String[] args) {
        
        Practica1 nu = new Practica1();
        nu.getAge();
        
    }
}


 abstract class Prueba2{
    private static int num = 0;
     
    
     abstract void men();
    
}

interface Prueba3{
    public final int NUM = 0;
    
     static int pure(){ return 0; }
    
}