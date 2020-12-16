package mx.com.sgah.datos.conexion;

import java.sql.*;

/**
 * Crea conexion a bd y cierra objetos utilizados
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Conexion {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private static Driver driver=null;
    
    // Define constantes para generar la conexion a bd
    private static final String JDBC_URL = "jdbc:mysql://localhost/sgah?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

    private static final String JDBC_USER = "root";

    private static final String JDBC_PASSWORD = "admin";

    /**
     * Genera una conexion a bd
     *
     * @return Connextion conexion a bd
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {

        if ( driver == null ) {
            
            try {
                
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
                
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
                
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace(System.out);
                
            }
        }

        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

    }

    /**
     * Cierra el objeto ResultSet
     *
     * @param rs objeto ResultSet
     */
    public static void close(ResultSet rs) {

        try {

            rs.close();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

    }

    /**
     * Cierra el objeto PreparedStatement
     *
     * @param stmt objeto PreparedStatement
     */
    public static void close(PreparedStatement stmt) {

        try {

            stmt.close();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

    }

    /**
     * Cierra el objeto Connection
     *
     * @param conn objeto Connection
     */
    public static void close(Connection conn) {

        try {

            conn.close();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

    }

}
