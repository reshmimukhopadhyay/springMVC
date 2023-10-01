package com.example.springproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns="/login-jsp")
public class LoginServletFromJsp extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        request.setAttribute("name",request.getParameter("name"));
        request.setAttribute("password",request.getParameter("password"));


       request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
    }
}
