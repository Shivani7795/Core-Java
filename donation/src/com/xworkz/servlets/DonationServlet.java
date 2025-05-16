package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation")
public class DonationServlet extends HttpServlet {
    public DonationServlet()
    {
        System.out.println("DonationServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost method in DonationServlet");
        String name = req.getParameter("Donar Name");
        String amount = req.getParameter("Amount");
        String cause = req.getParameter("cause");
        String email = req.getParameter("email");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("DonationSuccess.jsp");
        req.setAttribute("Name",name);
        req.setAttribute("amount",amount);
        req.setAttribute("cause",cause);
        req.setAttribute("email",email);
        requestDispatcher.forward(req, resp);

    }
}

