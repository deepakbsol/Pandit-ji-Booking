package com.book.paditji.payment.service.impl;

import com.book.paditji.payment.entity.PaymentDtls;
import com.book.paditji.payment.entity.PaymentOrderDtls;
import com.book.paditji.payment.repo.PaymentRepo;
import com.book.paditji.payment.service.PaymentService;
import com.book.paditji.payment.utils.PaymentConstant;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private RazorpayClient rozopayClient;
    private PaymentRepo paymentRepo;
    public PaymentServiceImpl(RazorpayClient rozopayClient,PaymentRepo paymentRepo){
        this.rozopayClient=rozopayClient;
        this.paymentRepo=paymentRepo;
    }
    @Override
    public PaymentOrderDtls generatePaymentOrder(PaymentDtls paymentDtls) {
        PaymentOrderDtls paymentOrderDtls=null;
        try {
            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount", Double.parseDouble(paymentDtls.getAmount())*100);
            orderRequest.put("currency", PaymentConstant.paymentCurrency);
            orderRequest.put("receipt", "order_rcptid_11");

            Order order = rozopayClient.orders.create(orderRequest);
            paymentOrderDtls=new PaymentOrderDtls();
            paymentOrderDtls.setAmount(order.get("amount"));
            paymentOrderDtls.setAmountPaidId(order.get("amount_paid"));
            //paymentOrderDtls.setNotes(order.get("notes").toString());
            paymentOrderDtls.setCreatedAt(order.get("created_at"));
            paymentOrderDtls.setAmountDue(order.get("amount_due"));
            paymentOrderDtls.setCurrency(order.get("currency"));
            paymentOrderDtls.setReceipt(order.get("receipt"));
            paymentOrderDtls.setOrderId(order.get("id"));
            paymentOrderDtls.setEntity(order.get("entity"));
            paymentOrderDtls.setOfferId(order.get("offer_id").toString());
            paymentOrderDtls.setStatus(order.get("status"));
            paymentOrderDtls.setAttempts(order.get("attempts"));
             this.paymentRepo.save(paymentOrderDtls);

        } catch (RazorpayException e) {
            throw new RuntimeException(e.getMessage());
        }
        return paymentOrderDtls;
    }
}
