
package builngblocks.ejercicio1;


public class TestB {

    int x,y;
    
    public TestB(int x, int y){
        
        initialize(x,y);
        
    }
    
    public void initialize(int x, int y){
        
        this.x = x*x;
        this.y = y*y;
        
    }

    static void main(String[] args) {
        
        int x = 3, y =5;
        TestB obj = new TestB(x, y);
        System.out.println(x + "" + y);
        
    }
    
}
