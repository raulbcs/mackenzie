<%--
    Document   : checkout
    Created on : Mar 3, 2017, 8:20:59 PM
    Author     : rb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkout</title>
    </head>
    <body> <%
        String userName = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("usuario")) {
                    userName = cookie.getValue();
                }
            }
        }
        %>
        <h3>Hi <%=userName%>, do the checkout.</h3> <br>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>