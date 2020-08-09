package methodsandescapsulations.ejercicio1;

public class CkeckingCount {
    
    public int amount;
    
    public CkeckingCount(int amount){
        this.amount = amount;
    }
    
    public int getMount(){
        return amount;
    }
    
    public void checkingAmount(int x){
        amount += x;
    }
    
    public static void main(String[] args) {
        
        CkeckingCount acct = new CkeckingCount((int)(Math.random()*1000));
//        acct.checkingAmount(-acct.getMount());
        acct.checkingAmount(-acct.amount);
//        acct.checkingAmount(0);
        System.out.println(acct.getMount());
        
        
    }
    
    
}
