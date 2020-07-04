package operatorandstatements.practica1;

public class Practica01 {

    public static void main(String[] args) {
        
//        operaciones();
//     
//        incrementador();
        
//        loop();
 
        Practica01 ts = new Practica01();
        
        System.out.println(isAvailable + " ");
        
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
        
    }
    
    public static boolean doStuff(){
        
        return !isAvailable;
        
    }
    
    static boolean isAvailable = false;
    
    public static void loop(){
        
        String cs[] = {"us", "uk"};
        int wc = 0;
        
        while(wc < cs.length){
            
            int count = 0;
            
            do{
                ++count;
            }while(count < cs[wc].length());
            
            System.out.println(cs[wc] + ":" + count);
            wc++;
            
        }
        
    }
    
    public static void incrementador(){
        
        int ii = 0;
        int jj = 7;
        
        for(ii = 0; ii < jj -1; ii = ii +2){
            
            System.out.println(ii + " ");
            
        }
        
    }
    
    public static void operaciones(){
        
        int a = 10;
        int b = 20;
        int c = (a * (b + 2)) - 10 - 4 * ((2 * 2) -6);
        System.out.println(c);
    
    }

    
}
