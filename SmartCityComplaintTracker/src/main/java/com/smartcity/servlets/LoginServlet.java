package com.smartcity.servlets;

import java.io.IOException;

import com.smartcity.dao.UserDAO;
import com.smartcity.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();
        User u = dao.login(email, password);
        if (u != null) {
            HttpSession session = req.getSession();
            session.setAttribute("userId", u.getId());
            session.setAttribute("role", u.getRole());
            if ("admin".equals(u.getRole()))
                resp.sendRedirect("admin-dashboard.jsp");
            else
                resp.sendRedirect("index.jsp");
        }
    }
}
