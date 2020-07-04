package arreglos;

import java.util.*;

public class TestDictionaty {

    public static void main(String[] args) {
        
       
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        
        for(int i = 0; i < n; i++){
            
            String name = in.next();
            int phone = in.nextInt();
            
            phoneBook.put(name,phone);

        }
        while(in.hasNext()){
            
            String s = in.next();
            boolean validator = phoneBook.containsKey(s);

            if(validator){
            
                System.out.println(s + "=" + phoneBook.get(s));
            
            }else{

                System.out.println("Not found");

            }


        }
        in.close();
    
        
        
        
    }

    
}
