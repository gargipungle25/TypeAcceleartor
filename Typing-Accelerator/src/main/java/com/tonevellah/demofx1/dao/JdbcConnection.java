package com.tonevellah.demofx1.dao;
import java.sql.*;

public class JdbcConnection {
    Connection connection = null;
    public Connection con() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem3miniproject", "root", "$Leaval10");


        } catch(Exception e){
            System.out.println("Connection not established.");
            System.out.println(e);
        }
        return connection;
    }
}
