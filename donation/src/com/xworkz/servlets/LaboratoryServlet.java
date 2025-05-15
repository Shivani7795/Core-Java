package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/laboratory")
public class LaboratoryServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String rollNumber = request.getParameter("rollNumber");
        String labName = request.getParameter("labName");
        String purpose = request.getParameter("purpose");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Laboratory Request Submitted</h1>");
        out.println("<p><strong>Student Name:</strong> " + studentName + "</p>");
        out.println("<p><strong>Roll Number:</strong> " + rollNumber + "</p>");
        out.println("<p><strong>Lab Name:</strong> " + labName + "</p>");
        out.println("<p><strong>Purpose:</strong><br>" + purpose + "</p>");


        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Laboratory.jsp");
        requestDispatcher.forward(request, response);
    }
}
