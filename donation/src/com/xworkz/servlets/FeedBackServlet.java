package com.xworkz.servlets;

import com.xworkz.Dto.FeedBackDto;
import com.xworkz.service.DService;
import com.xworkz.service.DonationServiceImplimentation;
import com.xworkz.service.FeedBackImpli;
import com.xworkz.service.FeedBackService;

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
        System.out.println("FeedBackServlet servlet constructor");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Feedback servlet");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String subject = req.getParameter("subject");
        String message = req.getParameter("message");

        FeedBackDto feedBackDto = new FeedBackDto();
        feedBackDto.setName(name);
        feedBackDto.setEmail(email);
        feedBackDto.setSubject(subject);
        feedBackDto.setMessage(message);

        FeedBackService feedBackService = new FeedBackImpli();
        boolean saved= feedBackService.save(feedBackDto);
        if(saved) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("donationSuccess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("feedBackDto", feedBackDto);
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


