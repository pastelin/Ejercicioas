package collections;

import java.util.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ManejoCollecciones {

    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        // puede agregar valores duplicados
        miLista.add(3);
        // imprimir(miLista);
        
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        // el valor duplicado no se agrega
        miSet.add("300");
        // imprimir(miSet);
        
        
        Map miMap = new HashMap();
        // llave valor
        miMap.put("valor1", "juan");
        miMap.put("valor2", "karla");
        miMap.put("valor3", "carlos");
        // elemento duplicado, sustituye al valor agregado previamente
        miMap.put("valor3", "rosario");
        // imprimir las llaves
        // imprimir(miMap.keySet());
        // imprimir valores
        // imprimir(miMap.values());
        
        System.out.println(miMap.get("valor2"));
        
    }
    
    private static void imprimir(Collection coleccion) {
        
        for (Object elemento : coleccion) {
            
            System.out.println("Elemento: " + elemento);
            
        }
        
        System.out.println("");
        
    }
    
}
