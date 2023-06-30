package com.otp.controller;

import com.otp.entity.OtpDtls;
import com.otp.service.VerifyOtpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VerifyOtpController {

    private VerifyOtpService verifyOtpService;
    public VerifyOtpController(VerifyOtpService verifyOtpService){
        this.verifyOtpService=verifyOtpService;
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestBody OtpDtls otpDtls){
        if(this.verifyOtpService.verifyOtp(otpDtls)){
          return new ResponseEntity<>("Otp verified successfully !!", HttpStatus.OK);
        }
        return new ResponseEntity<>("This is not correct Otp !",HttpStatus.BAD_REQUEST);
    }
}
