
package exception.ejercicio01;


public class Test3 {

    void readCard(int cardNo) throws Exception{
        
        System.out.println("Reading Card");
        
    }
    
    void checkCard(int CardNo) throws RuntimeException{
        
        System.out.println("Checking card");
        
    }
    
    public static void main(String[] args) {
        
        Test3 ex = new Test3();
        int cardNo = 1234;
        
        ex.checkCard(cardNo);
//        ex.readCard(cardNo);
    }
    
}