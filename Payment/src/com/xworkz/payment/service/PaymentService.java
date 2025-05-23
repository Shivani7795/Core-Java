package com.xworkz.payment.service;

import com.xworkz.payment.dto.PaymentDto;

public interface PaymentService {
    boolean save(PaymentDto paymentDto);

}
