
package pruebas;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ClaseHija extends ClasePadre{

    public void msg1() {
        
        System.out.println("Clase hija");
        
    }
    
    public static void main(String[] args) {
        
        ClasePadre clasePadre = new ClaseHija();
        
        ClaseHija claseHija = (ClaseHija) clasePadre;
        
        
    }
    
}
