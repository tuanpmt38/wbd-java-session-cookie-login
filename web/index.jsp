<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 5/4/18
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
  </head>
  <body>
  <h1>Home</h1>
  <%
    String username = (String)session.getAttribute("username");
    if(username != null){%>
        welcome : <%= username%>
  <a href="/logout?islogout=ok">logout</a>
    <%}
  %>
  </body>
</html>
