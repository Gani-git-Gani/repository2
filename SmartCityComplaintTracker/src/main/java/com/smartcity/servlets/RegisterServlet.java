package com.smartcity.servlets;

import java.io.IOException;

import com.smartcity.dao.UserDAO;
import com.smartcity.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        // Check if user exists
        if (userDAO.isEmailExists(email)) {
            response.sendRedirect("home.jsp?msg=User already registered, go to Login");
            return;
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        if (userDAO.register(user)) {
            response.sendRedirect("login.jsp?msg=Registered Successfully!");
        } else {
            response.sendRedirect("register.jsp?msg=Registration Failed");
        }
    }
}
