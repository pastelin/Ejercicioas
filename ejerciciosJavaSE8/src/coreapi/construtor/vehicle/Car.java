package coreapi.construtor.vehicle;

public class Car extends Vehicle{
    
    String trans;
    
    /* 
    
    // este ejemplo genera un error
    
    Car(){
        this.trans = trans;
    }
    
    */
    
    
    public Car(String trans){
        super("4w", 100);
        this.trans = trans;
    }
    
    Car(String type, int maxSpeed, String trans){
        super(type, maxSpeed);
        this.trans = trans;
    }
    
}
