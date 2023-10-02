package com.example.springproject.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns="/loginPage")
public class LoginFormServlet extends HttpServlet{
    private UserValidationService userValidationService = new UserValidationService();
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/WEB-INF/login_validation_form.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean userValidation = userValidationService.isUserValid(name, password);
        if (userValidation) {
            request.setAttribute("name", name);
            request.setAttribute("password", password);
            request.getRequestDispatcher("/WEB-INF/login_validation.jsp").forward(request, response);
        }else{
            request.setAttribute("errorMessage","Invalid name or password");
            request.getRequestDispatcher("/WEB-INF/login_validation_form.jsp").forward(request,response);
        }
    }

}
