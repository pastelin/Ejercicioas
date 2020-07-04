
package classdesign.sinreferencia.mystring;

public class MyString {

    String msg;
    
    public MyString(String msg){
        
        this.msg = msg;
        
    }

}


class Test{
    
    public static void main(String[] args) {
        
        System.out.println("Hello " + new StringBuilder("JavaSE8"));
        System.out.println("Hello " + new MyString("JavaSE8"));
        
    }
    
}
