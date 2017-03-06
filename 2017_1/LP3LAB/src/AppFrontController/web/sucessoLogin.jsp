<%--
    Document   : sucessoLogin
    Created on : Mar 3, 2017, 8:18:17 PM
    Author     : rb
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login bem sucedido</title>
    </head>
    <body> <%
    //allow access only if session exists
        String user = (String) session.getAttribute("usuario");
        String userName = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("usuario")) {
                    userName = cookie.getValue();
                }
                if (cookie.getName().equals("JSESSIONID")) {
                    sessionID = cookie.getValue();
                }
            }
        }%>
        <h3>Hi <%=userName%>, Login successful. Your Session ID=<%=sessionID%></h3> <br>
        User=<%=user%>
        <br>
        <a href="checkout.jsp">Checkout Page</a>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout" >
        </form>
    </body>
</html>
