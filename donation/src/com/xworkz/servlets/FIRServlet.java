package com.xworkz.servlets;

import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fir")
public class FIRServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String complainantName = request.getParameter("complainantName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String incidentDate = request.getParameter("incidentDate");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>FIR Submitted Successfully</h1>");
        out.println("<p><strong>Name:</strong> " + complainantName + "</p>");
        out.println("<p><strong>Phone:</strong> " + phone + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");
        out.println("<p><strong>Date of Incident:</strong> " + incidentDate + "</p>");

        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("FIR.jsp");
        requestDispatcher.forward(request, response);
    }
}
