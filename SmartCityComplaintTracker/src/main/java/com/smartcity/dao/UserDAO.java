package com.smartcity.dao;

import java.sql.*;
import com.smartcity.model.User;
import com.smartcity.util.DBConnection;
import org.mindrot.jbcrypt.BCrypt;

public class UserDAO {

    public boolean register(User user) {
        String sql = "INSERT INTO users (name,email,password,role) VALUES (?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, hashed);
            pst.setString(4, user.getRole());
            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User login(String email, String password) {
        String sql = "SELECT * FROM users WHERE email=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String hashed = rs.getString("password");
                if (BCrypt.checkpw(password, hashed)) {
                    User u = new User();
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("name"));
                    u.setEmail(rs.getString("email"));
                    u.setRole(rs.getString("role"));
                    return u;
                }
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }
    
    public boolean isEmailExists(String email) {
        String sql = "SELECT * FROM users WHERE email=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            return rs.next(); // email found

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}