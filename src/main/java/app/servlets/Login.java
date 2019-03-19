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

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        User user = (User) Model.login(email, password);

        //If user login successfully, show profile page or print that the Data is wrong
        if (user != null) {
            req.setAttribute("userInfo", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/profile.jsp");
            requestDispatcher.forward(req, resp);
        }
        else {
            req.setAttribute("wrong", (Boolean)true);
            doGet(req, resp);
        }
    }
}
