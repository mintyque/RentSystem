package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ChangePassword extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/changePassword.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String oldPassword = req.getParameter("old");
        String newPassword = req.getParameter("new");
        String confirm = req.getParameter("conf");

        Model m = new Model();


        //Checking validaty of login and old password
        User user = m.login(email, oldPassword);

        if (user == null) {
            req.setAttribute("result", 3); //is Password or email is wrong
        }
        else {
            //Send the data to change password
            Integer result = m.changePassword(user, newPassword, confirm);

            //Show a message that password was changed or no
            req.setAttribute("result", result);
        }

        doGet(req, resp);

        /*if (button.equals("toProfile")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/profile.jsp");
            requestDispatcher.forward(req, resp);
        }*/
    }
}
