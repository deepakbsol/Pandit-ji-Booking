package com.register.panditji.PanditJiRegistration.service.impl;

import com.register.panditji.PanditJiRegistration.model.PanditJiBasicInfo;
import com.register.panditji.PanditJiRegistration.repo.PanditJiRegistrationRepo;
import com.register.panditji.PanditJiRegistration.service.PanditJiRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class PanditJiRegistrationServiceImpl implements PanditJiRegistrationService {
    private PanditJiRegistrationRepo panditJiRegistrationRepo;
    public PanditJiRegistrationServiceImpl(PanditJiRegistrationRepo panditJiRegistrationRepo){
        this.panditJiRegistrationRepo=panditJiRegistrationRepo;
    }
    @Override
    public String savePanditJiBasecInfo(PanditJiBasicInfo panditJiBasicInfo) {
        return panditJiRegistrationRepo.savePanditJiBasecInfo(panditJiBasicInfo);
    }

}
