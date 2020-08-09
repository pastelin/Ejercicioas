package base2tobase10;

import java.util.*;

public class Base10toBase2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el número en base 10");
        int numero = sc.nextInt();
        
        StringBuilder sb = new StringBuilder("");
        int resto = 0;
        int division = numero;
        int count = 0;
        List<Integer> prueba = new ArrayList();
        
        
        while(division > 0){
         
            resto = division % 2;
            division /= 2;
            sb.append(resto);
            
        }
        
        for(int i = 0; i < sb.length(); i++){
            
            int num = Integer.parseInt(sb.toString().substring(i,i+1));
            
            if(num == 1){
                
                count++;
                
                if(i == sb.length() -1){
                    prueba.add(count);
                }
                
            }else{
                
                prueba.add(count);
                count = 0;
                
            }
            
        }
        
        
        Collections.sort(prueba);
        
        System.out.println(prueba.get(prueba.size() - 1));
        
    }
}
