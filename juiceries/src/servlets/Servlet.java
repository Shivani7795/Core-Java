package servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/juice")
public class Servlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("movie");

        String price = servletRequest.getParameter("price");
        int pri=0;
        if(price !=null) {
            pri = Integer.parseInt(price);
        }

        String address=servletRequest.getParameter("address");

        String noTickets = servletRequest.getParameter("tickets");
        int tic=0;
        if(noTickets !=null) {
            tic = Integer.parseInt(noTickets);
        }

        int TotalPayable = pri * tic;
        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Successfully Order placed</h1>");
        writer.println("<h2>total payable amount is </h2>"+TotalPayable);
    }
}
