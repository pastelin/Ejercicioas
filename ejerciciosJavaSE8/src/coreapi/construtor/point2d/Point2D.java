
package coreapi.construtor.point2d;


public class Point2D {

    private int x, y;
    
    public Point2D(int x, int y){
        
        this.x = x;
        y = y;
        
    }
    
    public String toString(){
        
        return "[" + x + ", " + y + "]";
        
    }
    
    public static void main(String[] args) {
        
        Point2D point = new Point2D(10, 20);
        
        System.out.println(point);
        
    }
    
    
    
}
