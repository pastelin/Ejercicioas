package classdesign.referenciaobjetos.c2;

public class C2 {
    
    public void displayC2(){
        System.out.println("c2");
    }

}


interface I{
    
    public void displayI();
    
}

class C1 extends C2 implements I{

    @Override
    public void displayI() {
        System.out.println("c1");
    }
    
    public static void main(String[] args) {
        
        C2 obj1 = new C1();
        I obj2 = new C1();
        
        /*
        
        // genera un error porque no son tipos compatibles
        C2 s = obj2;
        I t = obj1;

        */
        
       
      
        
    }
    
}