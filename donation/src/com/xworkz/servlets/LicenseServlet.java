package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String applicantName = request.getParameter("applicantName");
        String email = request.getParameter("email");
        String licenseType = request.getParameter("licenseType");
        String address = request.getParameter("address");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>License Application Submitted</h1>");
        out.println("<p><strong>Name:</strong> " + applicantName + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>License Type:</strong> " + licenseType + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("licenseservlet.jsp");
        requestDispatcher.forward(request, response);
    }
}
