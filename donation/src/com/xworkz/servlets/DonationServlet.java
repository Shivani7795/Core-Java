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
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String amount = req.getParameter("Amount");
        String cause = req.getParameter("cause");


        DonationDto dto = new DonationDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setAmount(amount);
        dto.setCause(cause);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("donationSuccess.jsp");
        req.setAttribute("dto",dto);
        requestDispatcher.forward(req, resp);

    }
}

