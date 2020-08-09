package methodsandescapsulations.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int j = 12;
        m(j);
        System.out.println(j);
        
    }

    
    static void m(int j){
        j = 7;
        if(false)
        return;
        
        j = 19;
    }
    
}
