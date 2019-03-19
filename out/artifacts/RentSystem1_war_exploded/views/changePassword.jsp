<%@ page import="app.entities.User" %><%--
  Created by IntelliJ IDEA.
  User: Artur
  Date: 2019-03-17
  Time: 13:28
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
        <h3>Change password</h3>
    </div>


    <div>
        <%
            if (request.getAttribute("result") == (Integer) 1) {
                User user = (User) request.getAttribute("userInfo");
                out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                        "   <h5>The password is changed!</h5>\n" +
                        "</div>");
            }
            if (request.getAttribute("result") == (Integer) 2) {
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                        "   <h5>The password doesn't match</h5>\n" +
                        "</div>");
            }
            if (request.getAttribute("result") == (Integer) 3) {
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +
                        "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                        "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                        "   <h5>The old password is wrong</h5>\n" +
                        "</div>");
            }
        %>
    </div>

    <div>
        <form method="post">

            <label>E-mail:
                <input type="text" name="email"><br />
            </label>
            <label>Old password:
                <input type="password" name="old"><br />
            </label>

            <label>New password:
                <input type="password" name="new"><br />
            </label>

            <label>Confirm new password:
                <input type="password" name="conf"><br />
            </label>

            <button type="submit" name = "button" value = "changePassword" class = "w3-btn w3-white w3-border w3-round-large">Change</button>
        </form>
    </div>

    <div>       <!-- content -->
        <div class = "w3-left">    <!-- buttons holder -->

            <!--<form method = "post">
                <button type="submit" name = "button" value = "toProfile" class = "w3-btn w3-white w3-border w3-round-large w3-center">Back to profile</button>
            </form>
            -->
            <button class = "w3-btn w3-white w3-border w3-round-large w3-center" onclick="location.href='/login'">Log out</button>

        </div>
    </div>


    </body>
</html>
