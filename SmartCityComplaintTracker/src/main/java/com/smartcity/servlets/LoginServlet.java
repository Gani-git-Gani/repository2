package com.smartcity.servlets;

import java.io.IOException;
import com.smartcity.dao.UserDAO;
import com.smartcity.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserDAO dao = new UserDAO();
        User u = dao.login(email, password);

        if (u != null) {
            HttpSession session = req.getSession();
            session.setAttribute("userId", u.getId());
            session.setAttribute("role", u.getRole());

            if ("admin".equals(u.getRole())) {
                resp.sendRedirect("admin-dashboard.jsp");
            } else {
                resp.sendRedirect("submitcomplaint.jsp");  // citizen homepage
            }
        } else {
            // INVALID LOGIN CASE (missing in your code)
            req.getSession().setAttribute("msg", "Invalid Email or Password!");
            resp.sendRedirect("login.jsp");
        }
    }
}
