package com.register.panditji.PanditJiRegistration.repo;

import com.register.panditji.PanditJiRegistration.model.PanditJiBasicInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PanditJiRegistrationRepo {
    public String savePanditJiBasecInfo(PanditJiBasicInfo panditJiBasicInfo);
}
