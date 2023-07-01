package com.book.paditji.payment.config;

import com.book.paditji.payment.utils.PaymentConstant;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public RazorpayClient client() throws RazorpayException {
        return new RazorpayClient(PaymentConstant.RZP_KEY_ID, PaymentConstant.RZP_KEY_SECRET);
    }
}
