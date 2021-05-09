package com.bbva.devops;

import java.util.List;

public class Aritmetica {
    
    public float ultimoResultado;
    
    private CloudService cloudService;
    
    public float suma(float primerSumando, float segundoSumando) {
        return ultimoResultado = primerSumando + segundoSumando;
    }

    public float resta(float minuendo, float sustraendo) {
        return ultimoResultado = minuendo - sustraendo;
    }
    
    public float cloudOp(float a, float b) {
        int c = cloudService.getValue();
        switch(c) {
            case 1: 
                return suma(a,b);
            case 2: 
                return resta(a,b);
            case 3: 
                return getDefaultNumber();
            case 4: 
                return sumValues(cloudService.getValues());
            default:
                return 0;
        }
        
    }
    
    private int getDefaultNumber() {
        return Aritmetica.class.hashCode();
    }
    
    private int sumValues(List<Integer> values) {
        int sum = 0;
        for(float value : values) {
            sum += value;
        }
        return sum;
    }
    
    private static int staticMethod(int value) {
        return value * value;
    }
    
    private int sumValueWithStaticCall(List<Integer> values) {
        int suma = 0;
        for(int value : values) {
            suma += value;
        }
        if(suma>10){
            suma+=staticMethod(suma);
        }
        return suma;
    }
    
}
