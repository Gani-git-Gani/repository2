<%@ page import="java.util.*, com.smartcity.dao.ComplaintDAO, com.smartcity.model.Complaint" %>
<%
    ComplaintDAO dao = new ComplaintDAO();
    List<Complaint> list = dao.getAllComplaints();
%>

<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>

<style>
body {
    font-family: Arial;
    background: #f4f4f4;
    padding: 20px;
}
table {
    width: 100%;
    background: white;
    border-collapse: collapse;
    margin-top: 20px;
}
th, td {
    border: 1px solid #ddd;
    padding: 12px;
}
th {
    background: #333;
    color: white;
}
button {
    padding: 5px 10px;
    background: #28a745;
    border: none;
    color: white;
    cursor: pointer;
}
select {
    padding: 5px;
}
</style>

</head>
<body>

<h1>Welcome Admin</h1>

<table>
<tr>
    <th>Complaint ID</th>
    <th>Citizen Name</th>
    <th>Email</th>
    <th>Issue Type</th>
    <th>Description</th>
    <th>Status</th>
    <th>Action</th>
</tr>

<%
for (Complaint c : list) {
%>
<tr>
    <td><%=c.getId()%></td>
    <td><%=c.getName()%></td>
    <td><%=c.getEmail()%></td>
    <td><%=c.getIssue()%></td>
    <td><%=c.getDetails()%></td>
    <td><%=c.getStatus()%></td>
    <td>
        <form action="update-status" method="post">
            <input type="hidden" name="id" value="<%=c.getId()%>">
            <select name="status">
                <option<%= c.getStatus().equals("Pending")?" selected":"" %>>Pending</option>
                <option<%= c.getStatus().equals("In Progress")?" selected":"" %>>In Progress</option>
                <option<%= c.getStatus().equals("Resolved")?" selected":"" %>>Resolved</option>
            </select>
            <button type="submit">Update</button>
        </form>
    </td>
</tr>
<%
}
%>
</table>

</body>
</html>
