package com.example.springproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns="/welcome-jsp-post")
public class WelcomeLoginWithPostServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        /*request.setAttribute("name",request.getParameter("name"));*/
        request.getRequestDispatcher("/WEB-INF/Welcome_login_post.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name",request.getParameter("name"));
        request.getRequestDispatcher("/WEB-INF/Welcome_login_with_Post.jsp").forward(request,response);

    }


}
