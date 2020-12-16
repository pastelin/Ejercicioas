package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Conexion {

    public static final String JDBC_URL = 
            "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    public static final String JDBC_USER = "root";
    public static final String JDBC_PASSWORD = "admin";

    public static DataSource getDataSource() {
        
        BasicDataSource ds = new BasicDataSource();
        
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        
        // Definimos el tamano inicial del pool de conexiones
        ds.setInitialSize(5);
        
        return ds;
        
    }

    
    
    public static Connection getConnection() throws SQLException{
        
        return getDataSource().getConnection();
           
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
