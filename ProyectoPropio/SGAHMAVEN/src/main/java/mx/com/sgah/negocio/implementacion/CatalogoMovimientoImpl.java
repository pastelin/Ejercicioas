package mx.com.sgah.negocio.implementacion;

import java.sql.SQLException;
import java.util.*;
import mx.com.sgah.datos.implementacion.AccesoDatosMovimientosDaoImpl;
import mx.com.sgah.datos.interfaz.AccesoDatosMovimientosDao;
import mx.com.sgah.dominio.MovimientoDTO;
import mx.com.sgah.excepciones.AccesoDatosEx;
import mx.com.sgah.negocio.interfaz.CatalogoMovimientosDao;

/**
 * Contiene las implementacioes de las operaciones necesarias de la aplicacion
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class CatalogoMovimientoImpl implements CatalogoMovimientosDao<MovimientoDTO> {

    /**
     * Llama al metodo agregar de la capa de datos
     *
     * @param ahorroDTOObj objeto a enviar
     * @return int numero de filas afectadas
     */
    @Override
    public int agregarMovimiento(MovimientoDTO ahorroDTOObj) {

        // Variable que contendra el numero de requistros afectados
        int rows = 0;

        try {

            System.out.println("Inicia el metodo agregarMovimiento");

            // Crea un objeto de AccesoDatosMovimientosDaoImpl de tipo AccesoDatosMovimientosDao
            AccesoDatosMovimientosDao accesoDatosMovimientosDao = new AccesoDatosMovimientosDaoImpl();

            // Con la referencia del objeto creado accedemos al metodo agregar que regresa el numero de 
            // filas afectadas
            rows = accesoDatosMovimientosDao.agregar(ahorroDTOObj);

            System.out.println("Fin del metodo agregarMovimiento");

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

        return rows;

    }

    @Override
    public int actualizarMovimiento(MovimientoDTO movimientoDTO) {
        // Variable que contendra el numero de requistros afectados
        int rows = 0;

        try {

            System.out.println("Inicia el metodo agregarMovimiento");

            // Crea un objeto de AccesoDatosMovimientosDaoImpl de tipo AccesoDatosMovimientosDao
            AccesoDatosMovimientosDao accesoDatosMovimientosDao = new AccesoDatosMovimientosDaoImpl();

            // Con la referencia del objeto creado accedemos al metodo agregar que regresa el numero de 
            // filas afectadas
            rows = accesoDatosMovimientosDao.actualizar(movimientoDTO);

            System.out.println("Fin del metodo agregarMovimiento");

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

        return rows;
    }

    @Override
    public List<MovimientoDTO> listarMovimiento() {

        System.out.println("Iniciando el metodo listarMovimiento");

        // Declara e inicializa lista de tipo MovimientoDTO
        List<MovimientoDTO> movimientosLista = new ArrayList();
        
        try {

            // Declara e inicializa objeto de tipo AccesoDatosMovimientosDao
            AccesoDatosMovimientosDao accesoDatosMovimientoDao = new AccesoDatosMovimientosDaoImpl();

            // Almacena lista de tipo movimientoDTO que retorna el metodo listar
            movimientosLista = accesoDatosMovimientoDao.listar();

            System.out.println("Finaliza el metodo listarMovimiento");

        } catch (AccesoDatosEx ex) {

            ex.printStackTrace(System.out);

        }

        return movimientosLista;

    }

    @Override
    public MovimientoDTO encontrar(MovimientoDTO movimientoDTO) {
        
        System.out.println("Iniciando el metodo encontrar");
    
        try {
            
            // Declara e inicializa objeto de tipo AccesoDatosMovimientosDao
            AccesoDatosMovimientosDao accesoDatosMovimientoDao = new AccesoDatosMovimientosDaoImpl();

            // Almacena lista de tipo movimientoDTO que retorna el metodo listar
            movimientoDTO = (MovimientoDTO) accesoDatosMovimientoDao.encontrar(movimientoDTO);

            System.out.println("Finaliza el metodo listarMovimiento");

        } catch (AccesoDatosEx ex) {

            ex.printStackTrace(System.out);

        }
        
        return movimientoDTO;
        
    }

}
