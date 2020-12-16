package com.mycompany.palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan");
        
    }
    
}


class Persona{
    
    String nombre;
    
    public Persona(String nombre){
        
        this.nombre = nombre; // apunta a un objeto de tipo Persona
        
        System.out.println("Impresion del operador (this) dentro de la clase Persona " + this);
        
        Imprimir imprimir = new Imprimir();
        
        imprimir.imprimir(this); // this contiene una referencia al objeto Persona
        
    }
    
    
}


class Imprimir{
    
    public void imprimir(Persona p){
        
        System.out.println("Impresion del argumento persona: " + p);
        System.out.println("Impresion del objeto actual (this) " + this);
        
    }
    
}
