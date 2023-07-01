package com.book.paditji.payment.service;

import com.book.paditji.payment.entity.PaymentDtls;
import com.book.paditji.payment.entity.PaymentOrderDtls;
import com.razorpay.Order;
import org.springframework.stereotype.Service;
@Service
public interface PaymentService {
    public PaymentOrderDtls generatePaymentOrder(PaymentDtls paymentDtls);
}
