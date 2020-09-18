package test;

import datosinterface.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class MenejoInterfaces {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        
        datos = new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        
        System.out.print(AccesoDatos.MAX_REGISTROS);
        
        
        
    }
    
}
