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
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(urlPatterns ="/annual")
public class AnnualEventServlet extends HttpServlet {
    public AnnualEventServlet(){
        System.out.println("constructor in servlet");
    }
    AnnualEventService annualEventService=new AnnualEventServiceImpl();
    AnnualEventDto annualEventDto=new AnnualEventDto();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in AnnualEventServlet");

        String instituteName=req.getParameter("instituteName");
        String location=req.getParameter("location");
        String guestName=req.getParameter("guestName");
        String chairs=req.getParameter("chairs");
        Integer c=0;
        if(chairs!=null){
            try{
                c=Integer.parseInt(chairs);
            }catch (NumberFormatException e){
                throw new RuntimeException(e);
            }
        }

        String eDate = req.getParameter("eDate");
        LocalDate date=null;
        if(eDate!=null){
            try{
                date=LocalDate.parse(eDate);
            }catch (NumberFormatException e){
                throw new RuntimeException(e);
            }
        }


        annualEventDto.setInstituteName(instituteName);
        annualEventDto.setLocation(location);
        annualEventDto.setGuestName(guestName);
        annualEventDto.setEDate(date);
        annualEventDto.setChairs(c);

        if (annualEventService.save(annualEventDto)) {
            req.setAttribute("successMessage", "Event details saved successfully");
        } else {
            req.setAttribute("failedMessage", "Failed to save event. Check the data.");
            req.setAttribute("eventDto", annualEventDto);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("AnnualEvent.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in AnnualEventServlet");

        String eventIdStr = req.getParameter("eventId");
        int eventId = 0;
        if (eventIdStr != null && !eventIdStr.isEmpty()) {
            eventId = Integer.parseInt(eventIdStr);
        }
    }
}





