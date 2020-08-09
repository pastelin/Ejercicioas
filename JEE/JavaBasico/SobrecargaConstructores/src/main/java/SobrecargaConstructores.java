public class SobrecargaConstructores {

    public static void main(String[] arg){
        
        Persona persona1 = new Persona("Juan", 23);    
        System.out.println("persona 1: " + persona1);
        
        Empleado empleado1 = new Empleado("Eunice", 31, 6000);
        System.out.println("empleado 1: " + empleado1);
        
    }
    
}
