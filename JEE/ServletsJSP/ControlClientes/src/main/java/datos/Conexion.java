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

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    private static BasicDataSource dataSource;

    public static DataSource getDataSource() {

        if ( dataSource == null ) {

            dataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(50);
            
        }

        return dataSource;

    }

    public static Connection getConnection() throws SQLException {

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
