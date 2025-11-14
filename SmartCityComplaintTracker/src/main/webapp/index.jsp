<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Smart City Complaint Tracker</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        form {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
            width: 300px;
            text-align: center;
        }
        input, textarea {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background: #0056b3;
        }
        h2 {
            color: #333;
        }
    </style>
</head>
<body>

    <form action="submitComplaint" method="post">
        <h2>Submit Your Complaint</h2>
        <input type="text" name="name" placeholder="Your Name" required><br>
        <input type="text" name="issue" placeholder="Issue Type" required><br>
        <textarea name="details" placeholder="Describe your issue" required></textarea><br>
        <button type="submit">Submit Complaint</button>
    </form>

<br>
    <a href="logout.jsp">Logout</a>
</body>
</html>
