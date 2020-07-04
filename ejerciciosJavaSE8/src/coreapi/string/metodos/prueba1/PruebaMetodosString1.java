
package coreapi.string.metodos.prueba1;


public class PruebaMetodosString1 {

    public static void main(String[] args) {
        
        ejemploIndexOf();
        ejemploReplace();
        
        StringBuilder sb = new StringBuilder("hola");
        
        sb.delete(0, sb.length());
        System.out.println(sb);
        
    }

    public static void ejemploIndexOf(){
        
        String myStr = "Hello World ";
        myStr.trim();

        int i1 = myStr.indexOf(" ");
        System.out.println(i1);
        
    }
    
    public static void ejemploReplace(){
        
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        
        System.out.println(ta);
    }
 
    public static void ejemploSwitch(){
        
        // puede recibir un int, Integer, short y byte
        // nose puede convertir de long a int
        
        byte x = 1;
        switch(x){
            
            case 1: 
                System.out.println("One");
                break;
            case 2: 
                System.out.println("Two");
                break;
            
        }
        
        
    }
    
}
