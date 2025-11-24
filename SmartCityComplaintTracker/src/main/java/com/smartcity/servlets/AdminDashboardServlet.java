package com.smartcity.servlets;

import com.smartcity.dao.ComplaintDAO;
import com.smartcity.model.Complaint;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin-dashboard")
public class AdminDashboardServlet extends HttpServlet {

    private ComplaintDAO complaintDAO = new ComplaintDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String statusFilter = request.getParameter("status");

        List<Complaint> complaints;

        if (statusFilter != null && !statusFilter.isEmpty()) {
            complaints = complaintDAO.getComplaintsByStatus(statusFilter);
        } else {
            complaints = complaintDAO.getAllComplaints();
        }

        request.setAttribute("complaints", complaints);
        request.getRequestDispatcher("admin-dashboard.jsp").forward(request, response);
    }
}