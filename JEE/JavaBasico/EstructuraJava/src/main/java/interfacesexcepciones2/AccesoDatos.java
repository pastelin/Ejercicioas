package interfacesexcepciones2;

import excepciones2.AccesoDatosEx;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public interface AccesoDatos {

    public static final int MAX_REGISTROS = 10;
    
    public abstract void insertar() throws AccesoDatosEx;
    
    public abstract void listar() throws AccesoDatosEx; 

    public abstract void simularError(boolean simularError);
    
}
