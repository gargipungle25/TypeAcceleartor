package com.tonevellah.demofx1.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Scene6ControllerDao {
    private final String INSERT_INTO_USERS_RECORD = "INSERT INTO User_Records(Username,wpm,accuracy,totWords,wrongwords) VALUES(?,?,?,?,?)";
    PreparedStatement psInsert = null;

    private JdbcConnection jdbcConnection = new JdbcConnection();

    public void insertIntoUsersRecord(String Username,int wpm, int totWords){
        try {
            psInsert = jdbcConnection.con().prepareStatement(INSERT_INTO_USERS_RECORD);

            psInsert.setString(1, Username);
            psInsert.setInt(2, wpm);
            int accuracy = (int) Math.round((wpm * 1.0 / totWords) * 100);
            psInsert.setInt(3, accuracy);
            psInsert.setInt(4, totWords);
            int wrongwords = totWords-wpm;
            psInsert.setInt(5,wrongwords); // wrong words
            psInsert.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }
}
