package com.xworkz.payment.repository;

import com.xworkz.payment.dto.PaymentDto;

public interface PaymentRepository {
    boolean persist(PaymentDto paymentDto);
}

