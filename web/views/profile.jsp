<%@ page import="app.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 2019-03-17
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile page</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
    <body class="w3-light-grey">
        <!-- header -->
        <div class="w3-container w3-blue-grey w3-opacity w3-center">
            <h3>Profile page</h3>
        </div>

        <ul>
            <%
                User user = (User) request.getAttribute("userInfo");

                if (user != null){
                    out.print("Name: " + user.getName() + "<br>");
                    out.print("Surname: "+ user.getSurname() + "<br>");
                    out.print("E-mail: " + user.getEmail());
                }
                else{
                    out.println("Wrong login or password");
                }
            %>
        </ul>

        <div class = "w3-left">
            <button name = 'change' class = "w3-btn w3-white w3-border w3-round-large w3-center" onclick="location.href='/changePassword'">Change password</button>
            <button name = 'logout' class = "w3-btn w3-white w3-border w3-round-large w3-center" onclick="location.href='/login'">Log out</button>
        </div>

    </body>
</html>
