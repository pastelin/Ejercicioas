package com.gm.mundocp;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++ contadorRatones;
    }
    
    public int getIdRaton(){
        return this.idRaton;
    }
    
    public int getContadorRatones(){
        return this.contadorRatones;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Raton{ idRaton=" + idRaton + " contadorRatones=" + contadorRatones + " }";
    }

}
