package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/donation")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("Donar Name");
        String lastName = request.getParameter("Amount");
        String cause = request.getParameter("cause");
        String email = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Thank You for Donating!</h1>");
        out.println("<p><strong>Name:</strong> " + firstName + "</p>");
        out.println("<p><strong>Amount:</strong> " + lastName + "</p>");
        out.println("<p><strong>cause:</strong><br>" + cause + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("donationservlet.jsp");
        requestDispatcher.forward(request, response);

    }
}
