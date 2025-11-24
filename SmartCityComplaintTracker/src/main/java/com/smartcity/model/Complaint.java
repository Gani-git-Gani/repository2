package com.smartcity.model;

import java.sql.Timestamp;

public class Complaint {
    private int id;
    private int userId;
    private String name;
    private String email;
	private String issue;
    private String details;
    private String status;
    private Timestamp createdAt;
    

    public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	// Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    public String getIssue() { return issue; }
    public void setIssue(String issue) { this.issue = issue; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
