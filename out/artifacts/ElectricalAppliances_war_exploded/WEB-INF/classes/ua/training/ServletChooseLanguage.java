package ua.training;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletChooseLanguage", urlPatterns = {"/ServletChooseLanguage"})
public class ServletChooseLanguage extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("Russian") != null) {

        }
        else if (request.getParameter("English") != null) {

        }
        response.sendRedirect("JSPView.jsp");
    }
}
