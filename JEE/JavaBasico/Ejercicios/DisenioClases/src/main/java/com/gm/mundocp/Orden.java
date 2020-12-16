package com.gm.mundocp;

public class Orden {

    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 3;

    public Orden(){
        this.idOrden = ++ contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        
        if(contadorComputadoras < MAX_COMPUTADORAS){
            
            this.computadoras[contadorComputadoras++] = computadora;
            
        }else{
        
            System.out.println("No se pudo agregar la computadora a la orden");
            
        }
        
        
    }
    
    public double calcularTotal(){
        
        double suma = 0;
        
        for(int i = 0; i < contadorComputadoras; i++){
            
            suma += this.computadoras[i].getPrecio();
            
        }
        
        return suma;
        
    }
    
    public void mostrarOrden(){
    
        System.out.println("++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total de la orden $"+ calcularTotal());
        System.out.println("Productos de la orden: ");
        
        for(int i = 0; i < contadorComputadoras; i++){
            
            System.out.println(this.computadoras[i]);
            
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++");
        
        
    }
    
}
