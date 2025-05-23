package com.xworkz.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class LaboratoryServlet extends HttpServlet {
    public LaboratoryServlet()
    {
        System.out.println("Laboratory servlet constructor");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Laboratory servlet");
        String studentName = req.getParameter("studentName");
        String rollNumber = req.getParameter("rollNumber");
        String labName = req.getParameter("labName");
        String purpose = req.getParameter("purpose");

        LaboratoryDto dto = new LaboratoryDto();
        dto.setStudentName(studentName);
        dto.setRollNumber(rollNumber);
        dto.setLabName(labName);
        dto.setPurpose(purpose);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
        req.setAttribute("dto",dto);
        requestDispatcher.forward(req,resp);







    }
}
