package com.smartcity.dao;

import java.sql.*;
import java.util.*;
import com.smartcity.model.Complaint;
import com.smartcity.util.DBConnection;

public class ComplaintDAO {

	public List<Complaint> getAllComplaints() {
	    List<Complaint> list = new ArrayList<>();

	    String sql = "SELECT c.id, c.user_id, c.name, c.issue, c.details, c.status, c.created_at, u.email " +
	                 "FROM complaints c " +
	                 "JOIN users u ON c.user_id = u.id " +
	                 "ORDER BY c.id DESC";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pst = conn.prepareStatement(sql);
	         ResultSet rs = pst.executeQuery()) {

	        while (rs.next()) {
	            Complaint c = new Complaint();
	            c.setId(rs.getInt("id"));
	            c.setUserId(rs.getInt("user_id"));
	            c.setName(rs.getString("name"));
	            c.setIssue(rs.getString("issue"));
	            c.setDetails(rs.getString("details"));
	            c.setStatus(rs.getString("status"));
	            c.setCreatedAt(rs.getTimestamp("created_at"));
	            c.setEmail(rs.getString("email"));   // from users table

	            list.add(c);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}


	public List<Complaint> getComplaintsByStatus(String status) {
	    List<Complaint> list = new ArrayList<>();
	    String sql = "SELECT * FROM complaints WHERE status = ? ORDER BY id DESC";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pst = conn.prepareStatement(sql)) {

	        pst.setString(1, status);
	        ResultSet rs = pst.executeQuery();

	        while (rs.next()) {
	            Complaint c = new Complaint();
	            c.setId(rs.getInt("id"));
	            c.setName(rs.getString("name"));
	            c.setEmail(rs.getString("email"));
	            c.setIssue(rs.getString("issue"));
	            c.setDetails(rs.getString("details"));
	            c.setStatus(rs.getString("status"));
	            list.add(c);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}

	public boolean submitComplaint(Complaint c) {
	    String sql = "INSERT INTO complaints (user_id, name, issue, details, status) VALUES (?, ?, ?, ?, 'Pending')";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pst = conn.prepareStatement(sql)) {

	        pst.setInt(1, c.getUserId());
	        pst.setString(2, c.getName());
	        pst.setString(3, c.getIssue());
	        pst.setString(4, c.getDetails());

	        return pst.executeUpdate() > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}


	public boolean deleteComplaint(int id) {
	    String sql = "DELETE FROM complaints WHERE id = ?";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pst = conn.prepareStatement(sql)) {

	        pst.setInt(1, id);
	        return pst.executeUpdate() > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	public boolean updateStatus(int id, String status) {
	    String sql = "UPDATE complaints SET status=? WHERE id=?";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pst = conn.prepareStatement(sql)) {

	        pst.setString(1, status);
	        pst.setInt(2, id);

	        return pst.executeUpdate() > 0;

	    }catch (Exception e) {
	        System.out.println("INSERT ERROR ---->");
	        e.printStackTrace();
	        return false;
	    }

	}


}
