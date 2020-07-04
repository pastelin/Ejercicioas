package coreapi.array.enteros.prueba1;

public class PruebaArray1 {

    public static void main(String[] args) {
        
        overrideArray();
        
    }

    public static void recorrer(){
        
        int[] arreglo = {1, 2, 3, 4};
        
        int i = 0;
        
        do{
            
            System.out.println(arreglo[i] + " ");
            i++;
            
        }while(i < arreglo.length -1);
    
    }
    
    
    public static void overrideArray(){
        
        int [] arreglo = new int[4];
//        arreglo[0] = 10;
//        arreglo[1] = 20;
        
        arreglo = new int[4];
        arreglo[2] = 30;
        arreglo[3] = 40;
        
        for(int i : arreglo){
            
            System.out.println(i);
            
        }
        
    }
    
}
