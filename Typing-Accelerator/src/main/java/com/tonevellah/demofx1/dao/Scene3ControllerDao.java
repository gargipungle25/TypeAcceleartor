package com.tonevellah.demofx1.dao;

import java.sql.*;

public class Scene3ControllerDao {

    JdbcConnection jdbcConnection = new JdbcConnection();
    PreparedStatement psInsert = null;
    Statement userTable = null;

    private final String GET_USERS = "SELECT * FROM user";
    private final String ADD_USER_BY_USERNAME_PASSWORD = "INSERT INTO user(username,password) VALUES(?,?)";

    public ResultSet getUsers() throws SQLException { //
        try {
            userTable = jdbcConnection.con().createStatement();
            ResultSet regTableRow = userTable.executeQuery(GET_USERS);
            return regTableRow;
        } catch(Exception e){
            System.out.println(e);
            System.out.println("Result set not created");
        }
        return null;
    }
    public boolean ifUsersExists(String username){
        try {
            ResultSet rs = getUsers();
            while(rs.next()){
                if(rs.getString("username").equals(username)) return true; // if user exists return true
            }
        } catch(Exception e){
            System.out.println("Error while create users resultset");
        }
        return false; // if user doesn't exist return false
    }

    public void addUser(String username, String password) {
        try {
            psInsert = jdbcConnection.con().prepareStatement(ADD_USER_BY_USERNAME_PASSWORD);
            psInsert.setString(1, username);
            psInsert.setString(2, password);
            psInsert.executeUpdate();
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Error while inserting into user table.");
        }
    }
}
