package com.example.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Tom" , loadOnStartup = 1)

public class BaseServlet extends GenericServlet{
    public BaseServlet() {
        System.out.println("running in BaseServlet");
    }
@Override
    public void service(ServletRequest servletrequest,ServletResponse servletresponse) throws java.io.IOException {

    }
}
