package com.book.paditji.payment.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "PAYMENT_ORDER_DTLS")
public class PaymentOrderDtls {

    @Id
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "AMOUNT",nullable = false)
    private Integer amount;
    @Column(name = "AMOUNT_PAID_ID",nullable = false)
    private Integer amountPaidId;
//    @Column(name = "NOTES")
//    private String notes;
    @Column(name = "CREATED_AT",nullable = false)
    private Date createdAt;
    @Column(name = "AMOUNT_DUE",nullable = false)
    private Integer amountDue;
    @Column(name = "CURRENCY",nullable = false)
    private String currency;
    @Column(name = "RECEIPT",nullable = false)
    private String receipt;
    @Column(name = "ENTITY",nullable = false)
    private String entity;
    @Column(name = "OFFER_ID")
    private String offerId;
    @Column(name = "STATUS",nullable = false)
    private String status;
    @Column(name = "ATTEMPTS",nullable = false)
    private Integer attempts;

}
