package com.book.paditji.payment.controller;

import com.book.paditji.payment.entity.PaymentDtls;
import com.book.paditji.payment.entity.PaymentOrderDtls;
import com.book.paditji.payment.service.PaymentService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping("/generate-payment-order")
    public ResponseEntity<PaymentOrderDtls> generatePaymentOrder(@RequestBody PaymentDtls paymentDtls){
        return new ResponseEntity<>(this.paymentService.generatePaymentOrder(paymentDtls), HttpStatus.OK);
    }
}
