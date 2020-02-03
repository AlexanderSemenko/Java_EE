<%--
  Created by IntelliJ IDEA.
  User: alexander
  Date: 05.01.20
  Time: 00:16
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>User name</th>
        <th>Birth Date</th>
    </tr>
    <% for (User user : users) {
    %>
    <tr>
        <td><%=user.getName()%>
        </td>
        <td><%=user.getBirthDate()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
