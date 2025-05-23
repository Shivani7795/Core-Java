package com.xworkz.payment.service;

import com.xworkz.payment.dto.PaymentDto;
import com.xworkz.payment.repository.PaymentRepository;

public class PaymentImpl implements PaymentService{
    public PaymentImpl(PaymentRepository paymentRepository) {
    }

    public boolean save(PaymentDto paymentDto) {
        String name = paymentDto.getPaymentMethod();
        if (name != null) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
            return false;
        }
        return true;
    }
}

