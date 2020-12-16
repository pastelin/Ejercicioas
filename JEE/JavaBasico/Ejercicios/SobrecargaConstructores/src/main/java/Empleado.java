public class Empleado extends Persona{
    
    private double sueldo;
    
    public Empleado(String nombre, int edad){
        super(nombre, edad);
    }
    
    // Constructor sobrecargado
    public Empleado(String nombre, int edad, double sueldo){
        this(nombre, edad);
        this.sueldo = sueldo;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public String toString(){
        return super.toString() + "Empledo { " + " sueldo: " + sueldo + " }";
    }
    
    
}
