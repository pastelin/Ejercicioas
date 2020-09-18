package test;

import excepciones2.*;
import interfacesexcepciones2.*;

/**
 *
 * @author Juan Pastelin Brioso
 *
 * @version 1.0
 */
public class ManejoExcepciones {

    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(false);
        ejecutar(datos, "listar");

        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(true);
        ejecutar(datos2, "insertar");
        
    }

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {

            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error lectura");                
                ex.printStackTrace(System.out);
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso a datos");
                ex.printStackTrace(System.out);
            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("procesar finally es opcional, pero siempe se va a ejecutar");
            }
            

        } else if ("insertar".equals("insertar")) {

            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
            } 
            finally {
                System.out.println("procesar finally es opcional, pero siempe se va a ejecutar");
            }
            
            
            
        } else {

            System.out.println("No se proporciono ninguna accion conocida");

        }

    }

}
