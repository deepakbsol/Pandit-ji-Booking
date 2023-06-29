package com.register.panditji.PanditJiRegistration.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Columns;

import java.time.LocalDateTime;

@Entity
@Table(name = "PANDIT_JI_DTLS")
@ToString
public class PanditJiBasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PID")
    private Long pid;
    @Column(name = "PFIRST_NAME",nullable = false,length = 50)
    private String pFirstName;

    @Column(name = "PLAST_NAME",nullable = false,length = 50)
    private String pLastName;

    @Column(name = "PADDRESS",nullable = false,length = 50)
    private String pAddress;

    @Column(name = "PMOBILE",nullable = false,length = 50)
    private String pMobile;

    @Column(name = "PEMAIL",nullable = false,length = 50,unique = true,updatable = false)
    private String pEmail;

    @Column(name = "ISVERIFIED_MOBILE",nullable = false)
    private String isVerifiedMobile="N";

    public String getIsVerifiedMobile() {
        return isVerifiedMobile;
    }

    public void setIsVerifiedMobile(String isVerifiedMobile) {
        this.isVerifiedMobile = isVerifiedMobile.toUpperCase();
    }

    @Column(name = "Date")
    private LocalDateTime date=LocalDateTime.now();

    public Long getPid() {
        return pid;
    }

    public String getpFirstName() {
        return pFirstName;
    }

    public String getpLastName() {
        return pLastName;
    }

    public String getpMobile() {
        return pMobile;
    }

    public void setpMobile(String pMobile) {
        this.pMobile = pMobile;
    }

    public String getpAddress() {
        return pAddress;
    }


    public String getpEmail() {
        return pEmail;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setpFirstName(String pFirstName) {
        this.pFirstName = pFirstName;
    }

    public void setpLastName(String pLastName) {
        this.pLastName = pLastName;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }


    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
