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
            "insert into movimiento (fecha, monto, descripcion, tipo_movimiento, asignacion) values(?,?,?,?,?)";
     
    private static final String SQL_SELECT = "select * from movimiento";

    private static final String SQL_SELECT_BY_ID = "select * from movimiento where id_movimiento = ?";
    
    private static final String SQL_UPDATE = 
            "update movimiento set monto=?, descripcion=? where id_movimiento=? and asignacion=?";

    @Override
    public int agregar(MovimientoDTO ahorroDTOObj) {

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
            stmt.setString(5, ahorroDTOObj.getAsignacion());

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
    public int actualizar(MovimientoDTO movimientoDTO) {
        
        System.out.println("Iniciando el metodo actualizar");
        
        // Declara objetos a utilizar
        Connection conn = null;
        PreparedStatement stmt = null;
        int row = 0;
        
        try {
            
            // Crea la conexion
            conn = Conexion.getConnection();
            
            // Crea objeto PreparedStatement para enviar la sentencia SQL a bd
            stmt = conn.prepareStatement(SQL_UPDATE);
            // Reemplaza el caracter ? del Query con los valores del objeto a insertar
            int index = 1;
            stmt.setFloat(index++, movimientoDTO.getMonto());
            stmt.setString(index++, movimientoDTO.getDescripcion());
            stmt.setInt(index++, movimientoDTO.getIdMovimiento());
            stmt.setString(index++, "borrow");
            
            System.out.println("Query a ejecutar : " + SQL_UPDATE);
            
            // Ejecuta la sentencia sql del objeto PreparedStatement y regresa un entero 
            // con el numero de registros afectados
            row = stmt.executeUpdate();
            
            System.out.println("Termina el metodo actualizar con " + row + " filas afectadas");
            
        } catch(SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        } finally {
            
            Conexion.close(stmt);
            Conexion.close(conn);
            
        }
        
        return row;

    }

    @Override
    public int eliminar(MovimientoDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MovimientoDTO> listar() {
        
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
                int idMovimiento = rs.getInt("id_movimiento");
                String fecha = rs.getString("fecha");
                float monto = rs.getFloat("monto");
                String descripcion = rs.getString("descripcion");
                String tipoMovimiento = rs.getString("tipo_movimiento");
                String asignacion = rs.getString("asignacion");
                asignacion = (asignacion == null) ? "" : asignacion;
                // Crea un nuevo objeto de tipo MovimientoDTO
                movimientoDTOObj = new MovimientoDTO(idMovimiento, monto, fecha, descripcion, tipoMovimiento, asignacion);
                
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
    public MovimientoDTO encontrar(MovimientoDTO movimientoDTO) {
        
        System.out.println("Iniciando el metodo encontrar");
        
        // Declara e inicializa los objetos a utilizar
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            
            // Crea la conexion
            conn = Conexion.getConnection();
            
            // Crea objeto PreparedStatement para enviar la sentencia SQL a bd
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            // Reemplaza el caracter ? del Query con los valores del objeto a insertar
            stmt.setInt(1, movimientoDTO.getIdMovimiento());
            
            System.out.println("Query a ejecutar : " + SQL_SELECT + "/n id_movimiento = " 
                    + movimientoDTO.getIdMovimiento());
            
            // Ejecuta la sentencia SQL dentro del objeto PreparedStatement y regresa 
            // el objeto ResultSet genereado por el query
            rs = stmt.executeQuery();
            rs.absolute(1);
            
            // Llena el objeto con la respuesta de BD
            String fecha = rs.getString("fecha");
            float monto = rs.getFloat("monto");
            String descripcion = rs.getString("descripcion");
            String tipoMovimiento = rs.getString("tipo_movimiento");
            String asignacion = rs.getString("asignacion");
            
            movimientoDTO.setFecha(fecha);
            movimientoDTO.setMonto(monto);
            movimientoDTO.setDescripcion(descripcion);
            movimientoDTO.setTipoMovimiento(tipoMovimiento);
            movimientoDTO.setAsignacion(asignacion);
            
            System.out.println("Iniciando el metodo encontrar");
            
        }catch(SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        } finally {
            
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
            
        }
        
        return movimientoDTO;
        
    }

}
