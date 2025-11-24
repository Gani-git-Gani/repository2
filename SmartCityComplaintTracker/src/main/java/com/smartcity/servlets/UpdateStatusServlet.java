package com.smartcity.servlets;

import com.smartcity.dao.ComplaintDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/update-status")
public class UpdateStatusServlet extends HttpServlet {

    ComplaintDAO dao = new ComplaintDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");

        dao.updateStatus(id, status);

        response.sendRedirect("admin-dashboard.jsp");
    }
}
