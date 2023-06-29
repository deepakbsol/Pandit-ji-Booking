package com.register.panditji.PanditJiRegistration.controller;

import com.register.panditji.PanditJiRegistration.model.PanditJiBasicInfo;
import com.register.panditji.PanditJiRegistration.service.PanditJiRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PanditJiRegistration {

    private PanditJiRegistrationService panditJiRegistrationService;
    public PanditJiRegistration(PanditJiRegistrationService panditJiRegistrationService){
        this.panditJiRegistrationService=panditJiRegistrationService;
    }
    @PostMapping(value = "/save-pandit-ji-info")
    public String savePanditJiBasicInfo(@RequestBody PanditJiBasicInfo panditJiBasicInfo){
        return this.panditJiRegistrationService.savePanditJiBasecInfo(panditJiBasicInfo);
    }

}
