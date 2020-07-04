package coreapi.array.recorriendo.prueba1;

public class RecorriendoArray {

     static void main(String[] args) {
        //withWhile();
        copiaArray();
    }
    
    public static void forEach(){
    
        int data[] = {2010, 2013, 2014, 2015, 204};
        int key = 2014;
        int count = 0;
        
        FIRTS: for (int e : data){
            
            if(e != key){
                
                continue;
                
            }
            
        }
    
    }

    public static void copiaArray(){
        
        int nums[] = new int[3];
        int nums2[] = {1,2,3,4,5};
        nums = nums2;
        
        
        for(int num : nums){
            
            System.out.println(num + ":");
            
        }
        
            
    }
    
    public static void withWhile(){

        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

        while(idx < size - 1){
            idx++;
            System.out.println(idx);
        }
        
        System.out.println("The top element: " + stack[idx]);

    }
    
    
    
}


