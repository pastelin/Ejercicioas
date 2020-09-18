package interfaces;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
public class Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        
        int base = n;
        int suma = 0;

        for(int i = 0; i < base; i++){

            int residuo = base % n;

            if(residuo == 0){
                
                suma += n;

            }   
            
            n--;
            
        }
        
        return suma;
        
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}