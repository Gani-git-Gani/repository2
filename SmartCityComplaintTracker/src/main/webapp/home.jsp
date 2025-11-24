<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Smart City Complaint Tracker</title>

<style>
  body {
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #81ecec, #6c5ce7);
    height: 100vh;
    margin: 0;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .container {
    text-align: center;
    background: white;
    padding: 40px 50px;
    border-radius: 12px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.3);
    width: 350px;
  }

  h1 {
    margin-bottom: 20px;
    color: #2d3436;
  }

  a {
    display: block;
    text-decoration: none;
    background-color: #0984e3;
    color: white;
    padding: 12px;
    border-radius: 6px;
    margin: 12px 0;
    font-size: 16px;
    transition: 0.3s;
  }

  a:hover {
    background-color: #74b9ff;
  }

  .msg {
    color: red;
    font-weight: bold;
    margin-bottom: 10px;
  }
</style>

</head>
<body>

<div class="container">
  <h1>Smart City Complaint Tracker</h1>

  <%
      String msg = request.getParameter("msg");
      if (msg != null) {
  %>
      <p class="msg"><%= msg %></p>
  <% } %>

  <a href="register.jsp">Register</a>
  <a href="login.jsp">Login</a>
</div>

</body>
</html>
