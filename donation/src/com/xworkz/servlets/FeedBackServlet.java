package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")
public class FeedBackServlet extends HttpServlet {
    public FeedBackServlet()
    {
        System.out.println("FeedBackServlet Constructor");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost Method in Feedback Servlet");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String subject = req.getParameter("subject");
        String message = req.getParameter("message");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FeedbackSuccess.jsp");
        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("subject",subject);
        req.setAttribute("message",message);
        requestDispatcher.forward(req,resp);
    }
}

