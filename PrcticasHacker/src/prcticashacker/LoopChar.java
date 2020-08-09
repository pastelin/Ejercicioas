package prcticashacker;

import java.util.*;

public class LoopChar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){

            char[] s = sc.next().toCharArray();

            for(int j = 0; j < s.length; j += 2){

                System.out.print(s[j]);
                
            }

            System.out.print(" ");

            for(int j = 1; j < s.length; j += 2){

                System.out.print(s[j]);

            }

            System.out.println("");


        }

        sc.close();        
 
        
        
    }

    
}
