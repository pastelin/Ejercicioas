package interfacesexcepciones2;

import excepciones2.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;
    
    @Override
    public void insertar() throws AccesoDatosEx {
        
        if (simularError){
            
            throw new EscrituraDatosEx("Error de escritura de datos");
            
        } else {
              
            System.out.println("Insetar desde MySql");
            
        }
            
    }
    
    @Override
    public void listar() throws AccesoDatosEx {
        
        if (simularError) {
            
            throw new LecturaDatosEx("Error de lectura de datos");
            
        } else {
            
            System.out.println("Listar desde MySql");
            
        }
        
    }
    
    @Override
    public void simularError(boolean simularError) {
        
        this.simularError = simularError;
        
    }
    
    public boolean isSimularError() {
        return this.simularError;
    }
    
}
