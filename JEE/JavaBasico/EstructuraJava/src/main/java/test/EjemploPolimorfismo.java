package test;

import sobreescritura.Empleado;
import sobreescritura.Gerente;

public class EjemploPolimorfismo {    
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 13000);  
        imprimirDetaller(empleado);
        
        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetaller(gerente);
        
    }
    
    public static void imprimirDetaller(Empleado empleado) {
        
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
    }

}