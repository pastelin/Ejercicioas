
package classdesign.list.arraylist;

import java.util.*;


public class R {

    public static void main(String[] args) {
        
        List<Integer> points = new ArrayList();
        
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        
        System.out.println(points);
        
        
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList(Arrays.asList(arr));
        
        if(arrList.removeIf((String s) -> { return s.length() <= 2;})){
            
            System.out.println(  " remove");
            
        }
        
        
        
    }

    
}
