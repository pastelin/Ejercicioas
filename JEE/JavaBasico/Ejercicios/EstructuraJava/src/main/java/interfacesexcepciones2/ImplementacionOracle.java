package interfacesexcepciones2;

import excepciones2.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;
    
    @Override 
    public void insertar() throws AccesoDatosEx {
    
        if (simularError) {
            
            throw new EscrituraDatosEx("Error de escritura de datos");
            
        } else {
            
            System.out.println("Insertar desde Oracle");
            
        }
        
        
    }
    
    @Override
    public void listar() throws AccesoDatosEx {
        
        if (simularError) {
            
            throw new LecturaDatosEx("Error de lectura de datos");
            
        }
        
        System.out.println("Listar desde Oracle");
        
    }
    
    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
    public boolean isSimularError() {
        return this.simularError;
    }
    
}
