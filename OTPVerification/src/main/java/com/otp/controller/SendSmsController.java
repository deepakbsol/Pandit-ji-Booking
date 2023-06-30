package com.otp.controller;

import com.otp.entity.OtpDtls;
import com.otp.service.SendOtpService;
import com.otp.util.OtpConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class SendSmsController {

    private SendOtpService sendOtpService;
    private SimpMessagingTemplate simpMessagingTemplate;
    public SendSmsController(SendOtpService sendOtpService,SimpMessagingTemplate simpMessagingTemplate){
        this.sendOtpService=sendOtpService;
        this.simpMessagingTemplate=simpMessagingTemplate;
    }
    @PostMapping("/send-otp")
    public ResponseEntity<String> sendOtp(@RequestBody OtpDtls sendOtpToMobile){
        try {
            sendOtpService.sendOtp(sendOtpToMobile);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        simpMessagingTemplate.convertAndSend(OtpConstants.TOPIC_DESTINATION, LocalDateTime.now()+"sms has been sent "+sendOtpToMobile.getMobile());
        return new ResponseEntity<>("Otp send to your registered mobile number. Please Verify....!",HttpStatus.OK);
    }



}
