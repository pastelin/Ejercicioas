package test;

import sobreescritura.Empleado;
import sobreescritura.Gerente;

public class EjemploSobreescritura {    
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 13000);  
        System.out.println("empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        System.out.println("gerente = " + gerente.obtenerDetalles());
        
    }

}