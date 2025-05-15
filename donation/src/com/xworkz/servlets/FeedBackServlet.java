package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/feedback")
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Thank You for Your Feedback</h1>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Subject:</strong> " + subject + "</p>");
        out.println("<p><strong>Message:</strong><br>" + message + "</p>");


        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("FeedBack.jsp");
        requestDispatcher.forward(request, response);
    }
}
