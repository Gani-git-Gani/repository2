<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #74b9ff, #a29bfe);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
  }

  form {
    background-color: white;
    padding: 30px 40px;
    border-radius: 12px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    text-align: center;
    width: 300px;
  }

  input {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 14px;
  }

  button {
    background-color: #0984e3;
    color: white;
    border: none;
    padding: 10px 15px;
    border-radius: 6px;
    cursor: pointer;
    width: 100%;
    font-size: 15px;
    transition: background-color 0.3s;
  }

  button:hover {
    background-color: #74b9ff;
  }

  input:focus {
    outline: none;
    border-color: #0984e3;
    box-shadow: 0 0 4px #74b9ff;
  }
</style>

</head>
<body>

<form action="login" method="post">
  <input name="email" type="email" placeholder="Email" required><br>
  <input name="password" type="password" placeholder="Password" required><br>
  <button type="submit">Login</button>
</form>
<%
    String msg = (String) session.getAttribute("msg");
    if (msg != null) {
%>
<script>
    alert("<%= msg %>");
</script>
<%
        session.removeAttribute("msg");
    }
%>

<br>
    <a href="index.jsp"></a>
</body>
</html>