package com.xworkz.payment.servlet;

import com.xworkz.payment.dto.PaymentDto;
import com.xworkz.payment.repository.PaymentRepository;
import com.xworkz.payment.repository.PaymentRepositoryImpl;
import com.xworkz.payment.service.PaymentImpl;
import com.xworkz.payment.service.PaymentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/payment")
public class PaymentServlet extends HttpServlet {

    protected PaymentService paymentService;

    public PaymentServlet() {
        System.out.println("PaymentServlet Constructor");
    }

    @Override
    public void init() {
        System.out.println("init method in PaymentServlet");
        PaymentRepository paymentRepository = new PaymentRepositoryImpl();
        this.paymentService = new PaymentImpl(paymentRepository);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in PaymentServlet");

        String paymentMethod = req.getParameter("paymentMethod");
        String transactionId = req.getParameter("transactionId");
        String amount = req.getParameter("amount");
        String paymentDate = req.getParameter("paymentDate");
        String customerName = req.getParameter("customerName");

        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setPaymentMethod(paymentMethod);
        paymentDto.setTransactionId(transactionId);
        paymentDto.setAmount(amount);
        paymentDto.setPaymentDate(paymentDate);
        paymentDto.setCustomerName(customerName);

        boolean saved = paymentService.save(paymentDto);

        if (saved) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("PaymentSuccess.jsp");
            req.setAttribute("paymentDto", paymentDto);
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("Payment.jsp");
            req.setAttribute("message", "Saving Payment Failed");
            dispatcher.forward(req, resp);
        }
    }
}
