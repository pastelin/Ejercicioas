package runtimepractice;

import java.util.HashMap;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class RunTimePractice {
    
    public static int findNumsOfRepetitions(String s, char c) {
        
        int suma = 0; 
        
        for ( int i = 0; i < s.length(); i++ ) {
            
            if ( s.charAt(i) == c ) {
                
                suma++;
                
            }
            
        }
        
        return suma;
        
    }
    
    public static int[] findNumsOfRepetitionsv1(String s, char[] c) {
        
        int[] sumas = new int[c.length];
        
        for ( int i = 0; i < s.length(); i++ ) {
            
            for ( int j = 0; j < c.length; j++) {
                
                if ( s.charAt(j) == c[j] ) {
                    
                    sumas[j] = sumas[j] + 1;
                    
                }
                
            }
            
        }
        
        return sumas;
        
    }
    
    public static int[] findNumsOfRepetitionsv2(String s, char[] c) {
        
        int[] sumas = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for ( int i = 0; i < s.length(); i++ ) {
            
            if ( !map.containsKey(s.charAt(i)) ) {
                
                map.put(s.charAt(i), 1);
                
            } else {
                
                int suma = map.get(s.charAt(i));
                map.put(s.charAt(i), suma+1);
                
            }
            
        }
        
        for ( int j = 0; j < c.length; j++ ) {
            
            int suma ;
             
            if ( !map.containsKey(c[j]) ) {
                
                sumas[j] = 0;
                
            } else {
                
                sumas[j] = map.get(c[j]);
                
            }
            
        }
        
        return sumas;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------");
        long startTime = System.currentTimeMillis();
        
        System.out.println(findNumsOfRepetitions("abca", 'a'));
        
        long endTime = System.currentTimeMillis();
        
        long duration = endTime - startTime;
        
        System.out.println("Test " + duration + "ms");
     
        char[] a = {'a', 'b'};
        
        System.out.println("-------------------------------------");
        long startTime2 = System.currentTimeMillis();
        
        System.out.println(findNumsOfRepetitionsv1("abfasdfafuheoifjdiojsklfnaklnaovnapsdjsaopfjaopjopjasopcmasñlkapfkovmavamcsdkaofkkbklmcscmlañsdlakfgogjsknbkmckjlkjlkasca", a));
        
        long endTime2 = System.currentTimeMillis();
        
        long duration2 = endTime - startTime;
        
        System.out.println("Test " + duration + "ms");
        
        
        System.out.println("-------------------------------------");
        startTime = System.currentTimeMillis();
        
        System.out.println(findNumsOfRepetitionsv2("abfasdfafuheoifjdiojsklfnaklnaovnapsdjsaopfjaopjopjasopcmasñlkapfkovmavamcsdkaofkkbklmcscmlañsdlakfgogjsknbkmckjlkjlkasca", a));
        
        endTime = System.currentTimeMillis();
        
        duration = endTime - startTime;
        
        System.out.println("Test " + duration + "ms");
        
        
        
    }
    
    
}
