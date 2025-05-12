package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/appointment")
public class AppointmentServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        String sickness = req.getParameter("sickness");
        String mobile = req.getParameter("mobile");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h1>Appointment Details Received</h1>");
        out.println("<p><strong>First Name:</strong> " + firstName + "</p>");
        out.println("<p><strong>Last Name:</strong> " + lastName + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        out.println("<p><strong>Sickness:</strong> " + sickness + "</p>");
        out.println("<p><strong>Mobile:</strong> " + mobile + "</p>");
    }
}
