package generics;

import java.util.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ColeccionesGenericas<T> {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList();
        miLista.add("Juan");
        miLista.add("Karla");
        miLista.add("Juan");
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("200");
        //imprimir(miSet);
        
        Map<String, String> miMap = new HashMap();
        miMap.put("1", "Juan");
        miMap.put("2", "Karla");
        miMap.put("3", "Carlos");
        imprimir(miMap.keySet());
        imprimir(miMap.values());
        System.out.println(miMap.get("1"));
        
    }
    
    private static void imprimir(Collection<String> col) {
        
        for (String elemento : col) {
            
            System.out.println("elemento: " + elemento);
            
        }
        System.out.println("");
        
    }
    
}
