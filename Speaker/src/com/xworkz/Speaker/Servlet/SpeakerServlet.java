package com.xworkz.Speaker.Servlet;

import com.xworkz.Speaker.Dto.SpeakerDto;
import com.xworkz.Speaker.Service.SpeakerService;
import com.xworkz.Speaker.Service.SpeakerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;


@WebServlet(urlPatterns = "/sound")

public class SpeakerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        String speakerType = req.getParameter("speakerType");
        String price = req.getParameter("price");
        String wirelessRange = req.getParameter("wirelessRange");
        String color = req.getParameter("color");
        String bluetooth = req.getParameter("bluetooth");

        SpeakerDto speakerDto=new SpeakerDto(brand,speakerType,Double.parseDouble(price),Double.parseDouble(wirelessRange),color,bluetooth);
        SpeakerService speakerService=new SpeakerServiceImpl();
        String result=speakerService.save(speakerDto);
        System.out.println("Result: "+result);
    }
}

