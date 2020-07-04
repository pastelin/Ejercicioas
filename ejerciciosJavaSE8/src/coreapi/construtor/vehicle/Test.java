package coreapi.construtor.vehicle;

public class Test {

    public static void main(String[] args) {
        
        Car car = new Car("Auto");
        Car car2 = new Car("4w", 150, "manual");
        
        System.out.println(car.type + " " + car.maxSpeed + " " + car.trans);
        System.out.println(car2.type + " " + car2.maxSpeed + " " + car2.trans);
        
        
    }
    
}
