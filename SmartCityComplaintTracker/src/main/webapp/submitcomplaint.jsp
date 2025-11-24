<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

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
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SubmitComplaint</title>

<style>
  body {
    font-family: Arial, sans-serif;
    background: #f4f6f8;
    margin: 0;
    padding: 0;
  }

  /* TOP RIGHT LOGOUT BUTTON */
  .logout {
    position: absolute;
    top: 20px;
    right: 30px;
    font-size: 16px;
    text-decoration: none;
    color: #0984e3;
    font-weight: bold;
  }

  .logout:hover {
    color: #0652DD;
  }

  .container {
    width: 400px;
    margin: 120px auto;
    background: white;
    padding: 40px 35px;
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    text-align: center;
  }

  input, textarea {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
  }

  button {
    background-color: #0984e3;
    color: white;
    border: none;
    padding: 10px 18px;
    border-radius: 6px;
    cursor: pointer;
    font-size: 15px;
  }

  button:hover {
    background-color: #74b9ff;
  }
</style>
</head>

<body>

<!-- TOP RIGHT LOGOUT -->
<a href="logout" class="logout">Logout</a>

<div class="container">
  <h2>Submit Your Complaint</h2>

  <form action="submitComplaint" method="post">
    <input type="text" name="name" placeholder="Your Name" required><br>
    <input type="text" name="issue" placeholder="Issue Type" required><br>
    <textarea name="details" placeholder="Describe your issue" required></textarea><br>
    <button type="submit">Submit Complaint</button>
</form>


</div>

</body>

</html>
