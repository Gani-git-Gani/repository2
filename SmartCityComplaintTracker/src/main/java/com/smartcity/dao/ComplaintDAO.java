package com.smartcity.dao;

import java.sql.*;
import com.smartcity.model.Complaint;
import com.smartcity.util.DBConnection;

public class ComplaintDAO {

    public boolean submitComplaint(Complaint complaint) {
        String sql = "INSERT INTO complaints (user_id, name, issue, details) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, complaint.getUserId());
            pst.setString(2, complaint.getName());
            pst.setString(3, complaint.getIssue());
            pst.setString(4, complaint.getDetails());

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
