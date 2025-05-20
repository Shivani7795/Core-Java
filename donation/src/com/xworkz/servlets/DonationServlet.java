package com.xworkz.servlets;

import com.xworkz.Dto.DonationDto;
import com.xworkz.service.DonationServiceImplimentation;
import com.xworkz.service.DService;

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
        String amount = req.getParameter("amount");
        String cause = req.getParameter("cause");

        DonationDto donationDto = new DonationDto();
        donationDto.setName(name);
        donationDto.setEmail(email);
        donationDto.setAmount(amount);
        donationDto.setCause(cause);

        DService dService = new DonationServiceImplimentation();
        boolean saved= dService.save(donationDto);
        if(saved) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("donationSuccess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("donationDto", donationDto);
            dispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("donation.jsp");
            req.setAttribute("message", "Saving of Donation Failed");
            dispatcher.forward(req,resp);
        }
    }
}

