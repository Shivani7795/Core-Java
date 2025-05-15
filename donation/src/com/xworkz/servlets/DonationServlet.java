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




        System.out.println("using request dispatcher to forward the req and res to another jsp/servlet");


        // abstraction : Servlet Chaining
        RequestDispatcher requestDispatcher=
                request.getRequestDispatcher("donation.jsp");
// jsp--> generate servlet--> service(servletRequest,servletResponse)==>write HTML;
        requestDispatcher.forward(request,response);

    }
}




/*
package com.xworkz.servlets;

import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        // Correctly named parameters (must match HTML form 'name' attributes)
        String donorName = request.getParameter("donorName");
        String amount = request.getParameter("amount");
        String cause = request.getParameter("cause");
        String email = request.getParameter("email");

        // Logging to server for debugging
        System.out.println("Donor Name: " + donorName);
        System.out.println("Amount: " + amount);
        System.out.println("Cause: " + cause);
        System.out.println("Email: " + email);

        // Optional: Set attributes to pass data to JSP
        request.setAttribute("donorName", donorName);
        request.setAttribute("amount", amount);
        request.setAttribute("cause", cause);
        request.setAttribute("email", email);

        // Forward to JSP
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Donation.jsp");
        requestDispatcher.forward(request, response);
    }
}
*/