package prcticashacker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrcticasHacker {

    public static void main(String[] args) {
        
        /*
        
        [01]?\\d{1,2}  numbers 0-199
        2[0-4]\\d      matches numbers 200-249
        25[0-5]        matches numbers 250-255 
        
        */
        
        
        
        Pattern p = Pattern.compile("[01]?\\d{1,2}");
        Matcher m = p.matcher("200");
        boolean b = m.matches();
        
        System.out.println(b);
        
        
    }
    
}
