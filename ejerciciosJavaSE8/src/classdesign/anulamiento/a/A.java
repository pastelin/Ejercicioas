
package classdesign.anulamiento.a;

public class A {

    public void test(){ 
        System.out.println("A");
    }

}

class B extends A{
    
    public void test(){
        System.out.println("B");
    }
    
}

class C extends A{
    
    public void test(){
        System.out.println("C");
    }
    
    public static void main(String[] args) {
    
        A b1 = new A();
        A b2 = new C();
        
        b1 = (A) b2;
        /*
        
        // lanza una excepcion ya que la clase c no conece a la clase b y no se
        // puede realizar el cast
        
        A b3 = (B) b2;
        
        */

        C b3 = (C) b1;
        b1.test();
        
    }
    
}
