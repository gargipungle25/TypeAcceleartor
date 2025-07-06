package com.tonevellah.demofx1.dao;

import com.tonevellah.demofx1.dao.CloseResourcesDao;

import java.io.IOException;
import java.sql.*;


public class Scene2ControllerDao {
    JdbcConnection con = new JdbcConnection();
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    private Scene3ControllerDao scene3ControllerDao = new Scene3ControllerDao();
    PreparedStatement psInsert = null;
    private final String GET_USERS = "SELECT * FROM user";
    public boolean checkUserExist(String username, String password){
        try {
            rs = scene3ControllerDao.getUsers();
            while(rs.next()){
                if((rs.getString("username").equals(username) && (rs.getString("password").equals(password)))) return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error while checking username and password");
        }
        return false; // if username and password doesn't match return false.
    }
}
