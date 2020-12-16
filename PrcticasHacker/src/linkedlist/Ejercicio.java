package linkedlist;

import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Ejercicio {

    static Queue<Nodo> queue = new LinkedList<Nodo>();
    
    public static Nodo remove(Nodo nodo) {
        
       
      
        List<Integer> lista = new ArrayList();
        
        Nodo current = nodo;
        
        while ( current != null ) {
            
            lista.add(current.data);
            
            current = current.next;
            
        }
        
        for ( int i = 0; i < lista.size(); i++) {
            
            int numero = lista.get(i);

            for ( int j = i + 1; j < lista.size(); j++) {
                
                if ( numero == lista.get(j) ) {
                    
                    lista.remove(j);
                    
                    j--;
                } 
                
            }
            
        }
        
        Collections.sort(lista);
        
        Nodo newNodo = null;
        
        for ( int i = 0; i < lista.size(); i++) {
            
            newNodo = add(newNodo, lista.get(i));
            
        }
        
        
        return newNodo;
        
    }

    public static Nodo add(Nodo nodo, int data) {

        Nodo temp = new Nodo(data);
        if (nodo == null) {

            nodo = temp;

        } else {

            Nodo start = nodo;

            while (start.next != null) {

                start = start.next;

            }

            start.next = temp;

        }

        return nodo;

    }

    public static void display(Nodo nodo) {

        Nodo currentNodo = nodo;

        while (currentNodo != null) {

            System.out.println(currentNodo.data);

            currentNodo = currentNodo.next;

        }

    }

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(7,7,7,7,7,7,7);

        Nodo nodo = null;

        for (int i = 0; i < lista.size(); i++) {

            nodo = add(nodo, lista.get(i));

        }

        //display(nodo);

        nodo = remove(nodo);

        display(nodo);
        
    }

}

class Nodo {

    public int data;
    Nodo next;

    public Nodo(int data) {

        this.data = data;
        this.next = null;

    }

}
