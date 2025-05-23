package com.xworkz.payment.repository;

import com.xworkz.payment.dto.PaymentDto;

public class PaymentRepositoryImpl implements PaymentRepository {

    public PaymentRepositoryImpl() {
        System.out.println("Running no-arg constructor in PaymentRepositoryImpl");
    }

    @Override
    public boolean persist(PaymentDto paymentDto) {
        System.out.println("Running persist in PaymentRepositoryImpl");
        return true;
    }
}