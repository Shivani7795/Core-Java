package com.xworkz.AnnualEvent.Servlet;

import com.xworkz.AnnualEvent.Dto.AnnualEventDto;
import com.xworkz.AnnualEvent.Service.AnnualEventService;
import com.xworkz.AnnualEvent.Service.AnnualEventServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/annualFind", loadOnStartup = 2)
public class AnnualEventServletFind extends HttpServlet {
    public AnnualEventServletFind() {
        System.out.println("constructor in AnnualEventServletFind");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String findId= req.getParameter("eventId");
        Integer id = 0;

        AnnualEventService annualEventService = new AnnualEventServiceImpl();
        if(findId!=null){
            try {
                id = Integer.parseInt(findId);
                AnnualEventDto annualEventDto = null;
                Optional<AnnualEventDto> optionalAnnualEventDto = annualEventService.findId(id);
                if (optionalAnnualEventDto.isPresent()) {
                    System.out.println("ID found");
                    annualEventDto = optionalAnnualEventDto.get();
                    req.setAttribute("message", "Details Found");
                    req.setAttribute("annualEventDto", annualEventDto);
                } else {
                    System.out.println("ID not found");
                    req.setAttribute("errorMessage", "Details not found");
                }
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("AnnualEventFindId.jsp");
                requestDispatcher.forward(req, resp);
            } catch (NumberFormatException e) {
                req.setAttribute("errorMessage", "Invalid Id");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("AnnualEventFindId.jsp");
                requestDispatcher.forward(req,resp);
            }
        }
    }
}