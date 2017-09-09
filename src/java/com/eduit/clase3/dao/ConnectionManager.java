
package com.eduit.clase3.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnectionManager {

    public ConnectionManager() {
    }

    public static Connection getConnection() throws Exception {

        String dbDriver = "com.mysql.jdbc.Driver";
        String dbConnString = "jdbc:mysql://localhost:3306/abm";
        String dbUser = "root";
        String dbPassword = "";
        Class.forName(dbDriver).newInstance();
        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
    }

}
