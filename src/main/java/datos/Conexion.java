package datos;

import java.sql.*;
//Clase para abrir y cerrar la conexion con la base de datos
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicRetrieval=true";
    private static final String JDBC_USER =  "root";
    private static final String JDBC_PASSWORD =  "admin";
    //Devuelve un objeto de tipo Connection
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }
    //aplicamos sobrecarga de metodos en el metodo close ya que reciben diferentes argumentas
    //metodo para cerrar el objeto de tipo ResultSet (el que contiene el resultado de la consulta)
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    //metodo para cerrar el objeto de tipo Statement (el que contiene la consulta qeu se ejecuta sobre la BD)
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    //Se utiliza mas PreparedStatement porque tiene un mejor performance
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    //metodo para cerrar el objeto de tipo Connection (el que establece la conexion con la BD)
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
