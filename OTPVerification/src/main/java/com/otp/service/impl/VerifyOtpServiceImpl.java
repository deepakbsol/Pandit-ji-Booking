package com.otp.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.otp.entity.OtpDtls;
import com.otp.service.VerifyOtpService;
import com.otp.util.OtpConstants;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;
@Service
public class VerifyOtpServiceImpl implements VerifyOtpService {

    private LoadingCache<String, Integer> otpCache;

    public VerifyOtpServiceImpl(){
        super();
        otpCache= CacheBuilder.newBuilder()
                .expireAfterWrite(OtpConstants.EXPIRE_MINS, TimeUnit.MINUTES)
                .build(new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String s) throws Exception {
                        return 0;
                    }
                });
    }
    @Override
    public int generateOtp(String key){
        Random random=new Random();
        int otp=100000+random.nextInt(900000);
        otpCache.put(key,otp);
        return otp;
    }
    @Override
    public int getOtp(String key){
        try {
            return otpCache.get(key);
        }catch (Exception exception){
            return 0;
        }
    }


    @Override
    public void clearOtp(String key){
        otpCache.invalidate(key);
    }

    @Override
    public Boolean verifyOtp(OtpDtls otpDtls) {
        if(getOtp(otpDtls.getMobile())==Integer.parseInt(otpDtls.getOtp())) {
            clearOtp(otpDtls.getMobile());
            return true;
        }

        return false;
    }


}
