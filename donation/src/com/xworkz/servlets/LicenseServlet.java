package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends HttpServlet {
    public LicenseServlet()
    {
        System.out.println("License Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in License Servlet");
        String applicantName = req.getParameter("applicantName");
        String email = req.getParameter("email");
        String licenseType = req.getParameter("licenseType");
        String address = req.getParameter("address");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LicenseSuccess.jsp");
        req.setAttribute("applicantName",applicantName);
        req.setAttribute("email",email);
        req.setAttribute("licenseType",licenseType);
        req.setAttribute("address",address);
        requestDispatcher.forward(req,resp);

    }
}
