package com.otp.service;

import com.otp.entity.OtpDtls;
import org.springframework.stereotype.Service;

@Service
public interface VerifyOtpService {

    public int generateOtp(String mobile);
    public int getOtp(String mobile);
    public void clearOtp(String mobile);
    public Boolean verifyOtp(OtpDtls otpDtls);

}
