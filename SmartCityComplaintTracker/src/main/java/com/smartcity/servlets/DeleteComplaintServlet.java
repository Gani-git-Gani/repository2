package com.smartcity.servlets;

import java.io.IOException;

import com.smartcity.dao.ComplaintDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete-complaint")
public class DeleteComplaintServlet extends HttpServlet {

    private ComplaintDAO dao = new ComplaintDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        dao.deleteComplaint(id);

        response.sendRedirect("admin-dashboard");
    }
}