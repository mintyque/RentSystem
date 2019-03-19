<%@ page import="app.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 2019-03-17
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Rent of physical items</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body class="w3-light-grey">
    <!-- header -->
    <div class="w3-container w3-blue-grey w3-opacity w3-center">
        <h3>Login to the system</h3>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </div>

    <div>
        <%
            if (request.getAttribute("wrong") != null && request.getAttribute("wrong") == (Boolean)true) {
                User user = (User) request.getAttribute("userInfo");
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                        "   <h5>The login or password is wrong</h5>\n" +
                        "</div>");
            }
        %>
    </div>

    <form method="post">
        <label>Email:
            <input type="text" name="email"><br />
        </label>

        <label>Password:
            <input type="password" name="pass"><br />
        </label>

        <button type = "submit" class = "w3-btn w3-white w3-border w3-round-large">Sign in</button>
    </form>

    </body>
</html>
