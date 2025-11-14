package com.smartcity.servlets;

import java.io.IOException;
import com.smartcity.dao.ComplaintDAO;
import com.smartcity.model.Complaint;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/submitComplaint")
public class ComplaintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("userId") == null) {
            resp.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        String name = req.getParameter("name");
        String issue = req.getParameter("issue");
        String details = req.getParameter("details");

        Complaint complaint = new Complaint();
        complaint.setUserId(userId);
        complaint.setName(name);
        complaint.setIssue(issue);
        complaint.setDetails(details);

        ComplaintDAO dao = new ComplaintDAO();
        if (dao.submitComplaint(complaint)) {
            resp.getWriter().println("Complaint submitted successfully!");
        } else {
            resp.getWriter().println("Failed to submit complaint. Try again!");
        }
    }
}
