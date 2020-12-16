package com.gm.mundocp;

public class Computadora {
    
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private double precio;
    private static int contadorComputadoras; 
    
    public Computadora(){
        this.idComputadora = ++contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton, double precio){
        this();
        this.nombre = nombre; 
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
    }
    
    public int getIdComputadore(){
        return this.idComputadora;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Monitor getMonitor(){
        return this.monitor;
    }
    
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    
    public Teclado getTeclado(){
        return this.teclado;
    }
    
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }
    
    public Raton getRaton(){
        return this.raton;
    }
    
    public void setRaton(Raton raton){
        this.raton = raton;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Computadora{ nombre=" + nombre + " monitor=" + getMonitor() +
                " teclado=" + getTeclado() + " raton=" + getRaton() + 
                " precio=" + precio + " }";
    }
    
}
