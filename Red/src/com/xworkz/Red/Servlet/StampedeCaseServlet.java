package com.xworkz.Red.Servlet;

import com.xworkz.Red.Dto.StampedeCaseDto;
import com.xworkz.Red.Service.StampedeCaseService;
import com.xworkz.Red.Service.StampedeCaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Red", loadOnStartup = 1)
public class StampedeCaseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String event = req.getParameter("event");
        String deaths = req.getParameter("deaths");
        String injuries = req.getParameter("injuries");
        String location = req.getParameter("location");

        StampedeCaseDto stampedeCaseDto = new StampedeCaseDto(event,Integer.parseInt(deaths),Integer.parseInt(injuries),location);
        StampedeCaseService stampedeCaseService = new StampedeCaseServiceImpl();
        String result = String.valueOf(stampedeCaseService.save(stampedeCaseDto));
        System.out.println("Result: "+result);
    }
}