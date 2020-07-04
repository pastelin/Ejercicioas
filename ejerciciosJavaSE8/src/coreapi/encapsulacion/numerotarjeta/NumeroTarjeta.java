package coreapi.encapsulacion.numerotarjeta;

public class NumeroTarjeta {

    public static String maskCC(String creditCard){
        
        String x = "xxxx-xxxx-xxxx-";
        
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15, 19);
        
        return sb.toString();
        
        //return x + creditCard.substring(15, 19);
    }

    public static void main(String[] args) {
        
        System.out.println(maskCC("1234-5678-9121-1121"));
        
    }


    
}
