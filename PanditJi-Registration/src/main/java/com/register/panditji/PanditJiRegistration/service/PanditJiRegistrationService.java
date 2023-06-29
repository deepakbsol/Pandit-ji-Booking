package com.register.panditji.PanditJiRegistration.service;

import com.register.panditji.PanditJiRegistration.model.PanditJiBasicInfo;
import org.springframework.stereotype.Service;

@Service
public interface PanditJiRegistrationService {
    public String savePanditJiBasecInfo(PanditJiBasicInfo panditJiBasicInfo);
}
