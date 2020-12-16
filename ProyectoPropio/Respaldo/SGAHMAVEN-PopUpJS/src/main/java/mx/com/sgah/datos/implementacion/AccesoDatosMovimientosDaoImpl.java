package mx.com.sgah.datos.implementacion;

import java.sql.*;
import java.util.*;
import mx.com.sgah.datos.conexion.Conexion;
import mx.com.sgah.datos.interfaz.AccesoDatosMovimientosDao;
import mx.com.sgah.dominio.MovimientoDTO;
import mx.com.sgah.excepciones.EscrituraDatosEx;
import mx.com.sgah.excepciones.LecturaDatosEx;

/**
 * Implmenta las operaciones a ejecutar en base de datos
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AccesoDatosMovimientosDaoImpl implements AccesoDatosMovimientosDao<MovimientoDTO> {

    // Declara e inicializa constantes con el QUERY a ejecutar
    private static final String SQL_INSERT = 
            "insert into movimiento (fecha, monto, descripcion, tipo_movimiento) values(?,?,?,?)";
     
    private static final String SQL_SELECT = "select * from movimiento";


    @Override
    public int agregar(MovimientoDTO ahorroDTOObj) throws EscrituraDatosEx {

        System.out.println("Inicia metodo agregar");

        // Declara objetos para manipular la bd
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            // Crea conexion a bd
            conn = Conexion.getConnection();

            // Crea objeto PreparedStatement para enviar la sentencia SQL a bd
            stmt = conn.prepareStatement(SQL_INSERT);

            // Reemplaza el caracter ? del Query con los valores del objeto a insertar
            stmt.setString(1, ahorroDTOObj.getFecha());
            stmt.setFloat(2, ahorroDTOObj.getMonto());
            stmt.setString(3, ahorroDTOObj.getDescripcion());
            stmt.setString(4, ahorroDTOObj.getTipoMovimiento());

            System.out.println("Query ejecutado");

            // Ejecuta la sentencia sql del objeto PreparedStatement y regresa un entero 
            // con el numero de registros afectados
            rows = stmt.executeUpdate();
            
            System.out.println("Finaliza el metodo con " + rows + " filas afectadas");

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        } finally {

            Conexion.close(stmt);
            Conexion.close(conn);

        }

        return rows;

    }

    @Override
    public int actualizar(MovimientoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(MovimientoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MovimientoDTO> listar() throws LecturaDatosEx {
        
        System.out.println("Inciando el metodo listar");
        
        // Declara e inicializa los objetos a utilizar
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        MovimientoDTO movimientoDTOObj = null;
        List<MovimientoDTO> listaMovimientos = new ArrayList();
        
        try {
            
            // Crea una conexion
            conn = Conexion.getConnection();
            
            // Crea objeto PreparedStatement para enviar la sentencia SQL a bd
            stmt = conn.prepareStatement(SQL_SELECT);
            
            System.out.println("Query a ejecutar : " + SQL_SELECT);
            
            // Ejecuta la sentencia SQL dentro del objeto PreparedStatement y regresa 
            // el objeto ResultSet genereado por el query
            rs = stmt.executeQuery();
            
            // El metodo next mueve el cursor a la siguiente fila de la posicion actual
            // Se ejecutara el ciclo hasta que no haya filas
            while ( rs.next() ) {
                
                // Declara e inicializa variables que almacenan el valor de la culumna de bd
                int id_movimiento = rs.getInt("id_movimiento");
                String fecha = rs.getString("fecha");
                float monto = rs.getFloat("monto");
                String descripcion = rs.getString("descripcion");
                String tipo_movimiento = rs.getString("tipo_movimiento");
                // Crea un nuevo objeto de tipo MovimientoDTO
                movimientoDTOObj = new MovimientoDTO(id_movimiento, monto, fecha, descripcion, tipo_movimiento);
                
                // Agrega el objeto creado a la lista
                listaMovimientos.add(movimientoDTOObj);
                
            }
            
            System.out.println("Finaliza el metodo listar");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        } finally {
            
            // Cierra los objetos creados
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
            
        }
        
        return listaMovimientos;
        
    }

    @Override
    public List<MovimientoDTO> bustar(MovimientoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
