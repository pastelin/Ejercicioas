package com.gm.mundocp;

public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;
    
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }
   
    public int getIdTeclado(){
        return this.idTeclado; 
    }
    
    public int getContadorTeclados(){
        return this.contadorTeclados;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Teclado {idTeclado=" + idTeclado + " contadorTeclados=" + contadorTeclados + " }";
    }
    
}
