package com.smartcity.servlets;

import java.io.IOException;
import com.smartcity.dao.UserDAO;
import com.smartcity.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = "citizen";

        User u = new User();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        u.setRole(role);

        UserDAO dao = new UserDAO();
        if (dao.register(u)) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.getWriter().println("<h3>Registration failed. Try again!</h3>");
        }
    }
}
