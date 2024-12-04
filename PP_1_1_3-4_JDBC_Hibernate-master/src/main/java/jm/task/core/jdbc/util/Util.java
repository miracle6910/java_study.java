package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public Connection getConnection()throws SQLException {
        Connection connection = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://localhost:55776;database=excelParser;user=miracle;password=55546123qwertY");

        }catch(ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}
