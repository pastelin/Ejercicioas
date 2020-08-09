package arreglos;

import java.util.*;

public class Arreglo2D {
 
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        // Arreglo que contendrá lo que se ingresa por teclado
        int[][] arr = new int[6][6];
        
        // Arreglo que almacena los datos de cada reloj de arena
        int[] suma = new int[16];
        
        
        // Dentro de este for anidado se guardan los valores de la cadena ingresada
        OUTER_LOPP:
        for(int i = 0; i < 6; i++){
            
            System.out.println("Numero");
            
            // Se genera un arreglo se tipo String con los valores recibidos 
            String[] rowItems = scanner.nextLine().split(" ");
            
            INNER_LOOP:
            for(int j = 0; j < 6; j++){
                
                // Convierte el String del arreglo a un tipo entero
                int arrItem = Integer.parseInt(rowItems[j]);
                
                // Guarda en la posicion dada el valor de arrItem
                arr[i][j] = arrItem;
                
            }
            
        }
        
        // Contador que ayudara a sumar las veces que se usa "y"
        int countX = 0;
        
        
        OUTER_LOOP:
        for(int y = 0; y < 4; y++ ){
            
            
            INNER_LOOP:
            for(int i = 0; i < 4; i++){
            
                suma[countX] = arr[y][i] + arr[y][i+1] + arr[y][i+2] +
                        arr[y+1][i+1] + arr[y+2][i] + arr[y+2][i+1] + arr[y+2][i+2]; 
            
                countX++;
            }
            
        }
        
        Arrays.sort(suma);
        
        System.out.println(suma[suma.length - 1]);
        
    }
    
    
}
