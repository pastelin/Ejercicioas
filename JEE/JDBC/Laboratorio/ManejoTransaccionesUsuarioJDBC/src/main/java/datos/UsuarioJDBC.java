package datos;

import domino.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class UsuarioJDBC {

    private static final String SQL_SELECT = 
            "select id_usuario, usuario, password from usuario";
    
    private static final String SQL_INSERT = 
            "insert into usuario (usuario,password) values(?,?)";
    
    private static final String SQL_UPDATE = 
            "update usuario set usuario=?, password=? where id_usuario=?";
    
    private static final String SQL_DELETE = 
            "delete from usuario where id_usuario=?";
    
    private Connection conexionTransaccional;
    
    
    public UsuarioJDBC() {
        
    }
    
    public UsuarioJDBC(Connection conn) {
        
        this.conexionTransaccional = conn;
        
    }
    
    /**
     * Realiza consulta a base datos
     * 
     * @return lista de tipo usuario con la informacion de bd
     * @throws SQLException 
     */
    public List<Usuario> selectUsuario() throws SQLException {
        
        System.out.println("Iniciando metodo selectUsuario");
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuarioObj = null;
        List<Usuario> listaUsuarios = new ArrayList();
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : 
                    Conexion.getConnextion();
            
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            System.out.println("Query ejecutado : " + SQL_SELECT);
            
            while ( rs.next() ) {
                
                int id_usuario = rs.getInt(1);
                String userName = rs.getString(2);
                String password = rs.getString(3);
                
                usuarioObj = new Usuario(id_usuario, userName, password);
                listaUsuarios.add(usuarioObj);
            }
            
            System.out.println("Finaliza consulda a bd");
            
        } finally {
            
            Conexion.close(rs);
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return listaUsuarios;
        
    }
    
    /**
     * Insreta rgistros a base de datos
     * 
     * @param usuarioObj objeto a insertar
     * @return int con el numero de registros afectados
     * @throws SQLException 
     */
    public int insertUsuario(Usuario usuarioObj) throws SQLException {
        
        System.out.println("Inicio del metodo insertUsuario");
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional :
                    Conexion.getConnextion();
            
            System.out.println("Query a ejecutar : " + SQL_INSERT);
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuarioObj.getUsuario());
            stmt.setString(2, usuarioObj.getPassword());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Finaliza insert con " + rows + " filas afectadas");
            
        } finally {
            
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return rows;
        
    }
 
    /**
     * Actualiza registros de base de datos
     * 
     * @param usuarioObj de tipo usuaro con los datos a actualizar
     * @return int numero de registros afectados
     * @throws SQLException 
     */
    public int updateUsuario(Usuario usuarioObj) throws SQLException {
        
        System.out.println("Inicia el metodo updateUsuario");
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional :
                    Conexion.getConnextion();
            
            System.out.println("Query a ejecutar : " + SQL_UPDATE);
            
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuarioObj.getUsuario());
            stmt.setString(2, usuarioObj.getPassword());
            stmt.setInt(3, usuarioObj.getIdUsuario());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Finaliza actualizacion con " + rows + " filas afectadas");
            
        } finally {
            
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return rows;
        
    }
    
    /**
     * Elimina registros de base de datos
     * 
     * @param usuarioObj de tipo usuario con los datos a eliminar
     * @return int numero de registros afectados
     * @throws SQLException 
     */
    public int deleteUsuario(Usuario usuarioObj) throws SQLException{
        
        System.out.println("Inicia el metodo deleteUsuario");
        
        Connection conn = null;
        PreparedStatement stmt = null; 
        int rows = 0;
        
        try  {
            
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : 
                    Conexion.getConnextion();
            
            System.out.println("Ejecuta query : " + SQL_DELETE);
            
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuarioObj.getIdUsuario());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Finalida delete con " + rows + " filas afectadas");
            
            
        } finally {
            
            Conexion.close(stmt);
            
            if ( this.conexionTransaccional == null ) {
                
                Conexion.close(conn);
                
            }
            
        }
        
        return rows;
        
    }
    
}
