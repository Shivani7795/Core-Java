package com.xworkz.servlets;

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

        FeedBackDto dto = new FeedBackDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setSubject(subject);
        dto.setMessage(message);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FeedBackSuccess.jsp");
        req.setAttribute("dto",dto);
        requestDispatcher.forward(req,resp);
    }
}


