package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/fir")
public class FIRServlet extends HttpServlet {
    public FIRServlet()
    {
        System.out.println("FIR Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in FIR servlet");

        String complainantName = req.getParameter("complainantName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String incidentDate = req.getParameter("incidentDate");



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FIRSuccess.jsp");
        req.setAttribute("complainantName",complainantName);
        req.setAttribute("phone",phone);
        req.setAttribute("address",address);
        req.setAttribute("incidentDate",incidentDate);
        requestDispatcher.forward(req,resp);
    }
}

