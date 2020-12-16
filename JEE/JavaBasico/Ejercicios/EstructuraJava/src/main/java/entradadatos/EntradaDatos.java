package entradadatos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class EntradaDatos {

    public static void main(String[] args) {
        
        String captura;
        String captura2 = null; 
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader brInput = new BufferedReader(input);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un dato");
        
        try {
            
            captura = brInput.readLine();
            System.out.println("Dato introducido: " + captura);
            
            System.out.println("Introduce un dato");
            captura2 = scanner.nextLine();
            
            while ( !"salir".equals(captura2) ) {
                
                System.out.println("Dato introducido = " + captura2);
                System.out.println("Introduce un dato");
                captura2 = scanner.nextLine();
                
            }
            
            
        } catch (IOException ex) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
    
}
