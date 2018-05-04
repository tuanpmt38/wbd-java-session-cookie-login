<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 5/4/18
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>
${error}
<h1>Login page</h1>
<form action="/login" method="POST">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="txtUsername" placeholder="Enter username" value=""/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="txtPassword" placeholder="Enter password" value=""/></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="chkRemember" value="ON"/>Remember to me</td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login"/></td>
        </tr>
    </table>
</form>
</body>
</html>
