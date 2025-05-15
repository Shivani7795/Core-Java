package com.xworkz.servlets;

import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String applicantName = request.getParameter("applicantName");
        String email = request.getParameter("email");
        String licenseType = request.getParameter("licenseType");
        String address = request.getParameter("address");

        // Pass data to the JSP
        request.setAttribute("applicantName", applicantName);
        request.setAttribute("email", email);
        request.setAttribute("licenseType", licenseType);
        request.setAttribute("address", address);

        System.out.println("Using RequestDispatcher to forward the request to Licence.jsp");

        // Forward to JSP (update the path if needed)
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/License.jsp");
        requestDispatcher.forward(request, response);
    }
}

/*<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>License Confirmation</title></head>
<body>
    <h1>License Application Submitted</h1>
    <p><strong>Name:</strong> ${applicantName}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>License Type:</strong> ${licenseType}</p>
    <p><strong>Address:</strong> ${address}</p>

    <hr>
</body>
</html>*/