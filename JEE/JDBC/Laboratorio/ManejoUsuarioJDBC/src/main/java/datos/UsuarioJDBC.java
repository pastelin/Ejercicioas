package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

/**
 * Clase que tiene como objetivo definir las acciones a realizar
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class UsuarioJDBC {

    // Define variables de las sentencias a ejecutar
    private static final String SQL_SELECT
            = "SELECT id_usuario, usuario, password from usuario";
    private static final String SQL_INSERT
            = "INSERT INTO usuario(usuario, password) values(?,?)";
    private static final String SQL_UPDATE
            = "UPDATE usuario set usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE
            = "DELETE from usuario where id_usuario=?";

    /**
     * Agrega un registro en base de datos
     *
     * @param usuarioObj
     * @return int con el numero de registros afectados
     */
    public int insertUsuario(Usuario usuarioObj) {

        System.out.println("Iniciando el metodo insertUsuario");

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuarioObj.getUsuario());
            stmt.setString(2, usuarioObj.getPassword());

            rows = stmt.executeUpdate();

            System.out.println("Query ejecutado: " + SQL_SELECT);
            System.out.println("Insersion satisfactoria, filas afectadas: " + rows);

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        } finally {

            Conexion.close(stmt);
            Conexion.close(conn);

        }

        return rows;

    }

    /**
     * Obtiene informacion de base de datos
     *
     * @return lista de tipo usuario con los datos obtenidos de la base de datos
     */
    public List<Usuario> selectUsuario() {

        System.out.println("Iniciando el metodo selectUsuario");

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        List<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;

        try {

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            System.out.println("Query a ejecutar : " + SQL_SELECT);

            while (rs.next()) {

                int id_usuario = rs.getInt("id_usuario");
                String usuarioName = rs.getString("usuario");
                String password = rs.getString("password");

                usuario = new Usuario(id_usuario, usuarioName, password);

                listaUsuarios.add(usuario);

            }

            System.out.println("Consulta a la base de datos correctamente");

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        } finally {

            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        }

        return listaUsuarios;

    }

    /**
     * Actualiza registros de base de datos
     *
     * @param usuarioObj de tipo usuario con los datos a actualizar
     * @return int numero de registros afectados
     */
    public int updateUsuario(Usuario usuarioObj) {

        System.out.println("Iniciando el metodo updateUsuario");

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            System.out.println("Query a ejecutar: " + SQL_UPDATE);
            stmt.setString(1, usuarioObj.getUsuario());
            stmt.setString(2, usuarioObj.getPassword());
            stmt.setInt(3, usuarioObj.getIdUsuario());

            rows = stmt.executeUpdate();

            System.out.println("Actualizacion correcte, registros afectados : " + rows);
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        } finally {

            Conexion.close(stmt);
            Conexion.close(conn);

        }

        return rows;

    }

    /**
     * Elimina registros de base de datos
     * 
     * @param usuarioObj de tipo usuario con el valor id_usuario a eliminar
     * @return int numero de registros afectados
     */
    public int deleteUsuario(Usuario usuarioObj) {

        System.out.println("Iniciando metodo deleteUsuario");
        
        Connection conn = null; 
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            System.out.println("Query a ejecutar : " + SQL_DELETE);
            
            stmt.setInt(1, usuarioObj.getIdUsuario());
            rows = stmt.executeUpdate();
            
            System.out.println("Elima correctamente registro con el id_usuario=" + 
                    usuarioObj.getIdUsuario());
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        } finally {
            
            Conexion.close(stmt);
            Conexion.close(conn);
            
        }
        
        return rows;
        
    }

}
