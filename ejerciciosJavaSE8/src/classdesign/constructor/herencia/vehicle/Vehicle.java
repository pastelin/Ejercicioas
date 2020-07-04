
package classdesign.constructor.herencia.vehicle;


public class Vehicle {

    int x;
    
    Vehicle(){
    
        this(10);
        
    }
    
    Vehicle(int x){
        
        this.x = x;
        
    }

}

class Car extends Vehicle{
    
    int y;
    
    /*
    
    // genera un error porque tanto super() y this() deben ir en la primera linea
    // ya que ambos hacen una llamada a un constructor
    
    Car(){
        super();
        this(20);
        
    }

    */
    
    Car(){
        
        this(20);
        
    }
    
    Car(int y){
        
        this.y = y;
        
    }
    
    public String toString(){
        return super.x  + " : " + this.y;
    }
    
    public static void main(String[] args) {
        
        Vehicle y = new Car();
        
        System.out.println(y);
    }
    
}
