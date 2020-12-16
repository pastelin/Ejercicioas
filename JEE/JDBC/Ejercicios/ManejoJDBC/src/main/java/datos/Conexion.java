package datos;

import java.sql.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Conexion {

    public static final String JDBC_URL = 
            "jdbc:mysql://localhost/sgah?useSSL=false&serverTimezone=UTC";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PASSWORD = "admin";
    
    
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
           
    }
    
    public static void close(ResultSet rs) {
        
        try {
            
            rs.close();
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
    
    public static void close(PreparedStatement stmt) {
        
        try {
            
            stmt.close();
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
    
    public static void close(Connection conn) {
        
        try {
              
            conn.close();
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
    
}
