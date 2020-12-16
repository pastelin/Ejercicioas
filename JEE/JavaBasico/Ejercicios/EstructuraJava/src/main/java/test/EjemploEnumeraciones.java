package test;

import enumeraciones.*;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        
        // Valores de la enumeración
        System.out.println("Valor 1:" + Dias.LUNES);
        System.out.println("Valor 1:" + Dias.MARTES);
        
        
        // Utilizamos la enumeracion de paises
        System.out.println("Continente no.4:" + Continentes.AMERICA);
        System.out.println("Accedemos al numero de paises del continenete 4:" + 
                Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no.1:" + Continentes.AFRICA);
        System.out.println("No. de paises del continente 1:" + Continentes.AFRICA.getPaises());
    }
    
}
