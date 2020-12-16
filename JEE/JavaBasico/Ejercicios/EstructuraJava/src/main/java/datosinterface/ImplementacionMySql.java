package datosinterface;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insetar desde MySql");
    }
    
    @Override
    public void listar() {
        
        System.out.println("Listar desde MySql");
        
    }
    
    
    
}
