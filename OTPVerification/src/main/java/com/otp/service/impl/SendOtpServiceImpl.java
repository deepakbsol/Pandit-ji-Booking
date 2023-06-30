package com.otp.service.impl;

import com.otp.entity.OtpDtls;
import com.otp.service.SendOtpService;
import com.otp.service.VerifyOtpService;
import com.otp.util.OtpConstants;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class SendOtpServiceImpl implements SendOtpService {

    private VerifyOtpService verifyOtpService;
    public SendOtpServiceImpl(VerifyOtpService verifyOtpService){
        this.verifyOtpService=verifyOtpService;
    }
    @Override
    public void sendOtp(OtpDtls sendOtpToMobile) {
        Twilio.init(OtpConstants.ACCOUNT_SID,OtpConstants.AUTH_TOKEN);

        int number=verifyOtpService.generateOtp(sendOtpToMobile.getMobile());
        String msg="your otp :- "+number+" Please verify this otp with Application";
        Message message=Message.creator(new PhoneNumber(sendOtpToMobile.getMobile()),
                new PhoneNumber(OtpConstants.FROM_NUMBER),msg).create();

    }
}
