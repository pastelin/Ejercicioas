
package arreglos;

import java.util.*;


public class DictionaryPractice {

    public static void main(String[] args) {
        
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();

        // putting things inside our Dictionary
        englSpanDictionary.put("Lunes", "Monday");
        englSpanDictionary.put("Martes", "Tuesday");
        englSpanDictionary.put("Miercoles", "Wednesday");
        englSpanDictionary.put("Jueves", "Thursday");
        englSpanDictionary.put("Viernes", "Friday");
        
        // retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Lunes"));
        System.out.println(englSpanDictionary.get("Martes"));
        System.out.println(englSpanDictionary.get("Miercoles"));
        System.out.println(englSpanDictionary.get("Jueves"));
        System.out.println(englSpanDictionary.get("Viernes"));
        
        // print out all keys
        System.out.println(englSpanDictionary.keySet());
        
        // print out all values
        System.out.println(englSpanDictionary.values());
        
        // print size
        System.out.println(" The zise of our Dictionary is " + englSpanDictionary.size());
        
        
        // shopping list
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        
        // put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Ham", false);
        
        // retrive items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        
        // key-value pairs print out
        System.out.println(shoppingList.toString());
        
        // is empty?
        System.out.println(shoppingList.isEmpty());
        
        // remove things
        shoppingList.remove("Eggs");
        
        // key-value pairs print out
        System.out.println(shoppingList.toString());
        
        // replace values for a certain key
        shoppingList.replace("Bred", Boolean.FALSE);
        
        // key-value pairs print out
        System.out.println(shoppingList.toString());
        
        // clear Dictionary
        shoppingList.clear();
        
        // key-value pairs print out
        System.out.println(shoppingList.toString());
        
    }

    
}
