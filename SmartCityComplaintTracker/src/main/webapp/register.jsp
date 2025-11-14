<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
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
    width: 320px;
  }

  input, select {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 14px;
  }

  select {
    background-color: #f9f9f9;
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

  input:focus, select:focus {
    outline: none;
    border-color: #0984e3;
    box-shadow: 0 0 4px #74b9ff;
  }
</style>

</head>
<body>

<form action="register" method="post">
  <input name="name" placeholder="Name" required><br>
  <input name="email" type="email" placeholder="Email" required><br>
  <input name="password" type="password" placeholder="Password" required><br>
  <select name="role">
    <option value="citizen">Citizen</option>
    <option value="technician">Technician</option>
  </select><br>
  <button type="submit">Register</button>
</form>

</body>
</html>