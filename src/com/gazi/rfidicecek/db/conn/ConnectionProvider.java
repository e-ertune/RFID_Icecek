
package com.gazi.rfidicecek.db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    static final String username = "postgres";
    static final String password = "blp123";
    static final String connUrl = "jdbc:postgresql://localhost/dbiceceksistemi";
    
    static Connection conn = null;
    public static Connection getConn(){
        try {
            conn = DriverManager.getConnection(connUrl, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
