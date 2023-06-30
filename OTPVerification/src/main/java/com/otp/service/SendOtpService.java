package com.otp.service;

import com.otp.entity.OtpDtls;

public interface SendOtpService {
    public void sendOtp(OtpDtls sendOtpToMobile);
}
