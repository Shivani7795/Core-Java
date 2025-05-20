package com.xworkz.servlets;

import com.xworkz.Dto.FIRDto;
import com.xworkz.service.FirServiceImpli;
import com.xworkz.service.FIRService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR")
public class FIRServlet extends HttpServlet {
    public FIRServlet()
    {
        System.out.println("FIR Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in FIR servlet");

        String name = req.getParameter("name");
        String complainantName = req.getParameter("complainantName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String incidentDate = req.getParameter("incidentDate");

        FIRDto fIRDto = new FIRDto();
        fIRDto.setName(name);
        fIRDto.setComplaintName(complainantName);
        fIRDto.setPhone(phone);
        fIRDto.setAddress(address);
        fIRDto.setIncidentDate(incidentDate);

        FIRService FIRService = new FirServiceImpli();
        boolean saved= FIRService.save(fIRDto);
        if(saved) {
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("FIRSuccess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("fIRDto", fIRDto);
            dispatcher.forward(req,resp);
        }
        else{
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("FIR.jsp");
            req.setAttribute("message", "Saving of FIR Failed");
            dispatcher.forward(req,resp);
        }
    }
}

