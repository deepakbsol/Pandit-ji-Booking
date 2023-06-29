package com.register.panditji.PanditJiRegistration.repo.impl;

import com.register.panditji.PanditJiRegistration.model.PanditJiBasicInfo;
import com.register.panditji.PanditJiRegistration.repo.PanditJiRegistrationRepo;
import jakarta.persistence.EntityManager;
import org.hibernate.*;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;

@Repository
public class PanditJiRegistrationRepoImpl implements PanditJiRegistrationRepo {

    private EntityManager enitityManager;

    public PanditJiRegistrationRepoImpl(EntityManager enitityManager){
        this.enitityManager=enitityManager;
    }
    @Override
    public String savePanditJiBasecInfo(PanditJiBasicInfo panditJiBasicInfo) {
        System.out.println("pandit-ji-details-save--->"+panditJiBasicInfo);
        Session session=this.enitityManager.unwrap(Session.class);
        Transaction tx=session.beginTransaction();
        try{
            session.persist(panditJiBasicInfo);
        }catch (Exception exception){
            return exception.getMessage();
        }
        tx.commit();
        session.close();
        return "Data saved successfully !!!";
    }

}
