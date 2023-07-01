package com.book.paditji.payment.repo;

import com.book.paditji.payment.entity.PaymentOrderDtls;
import com.razorpay.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface PaymentRepo extends CrudRepository<PaymentOrderDtls,Integer> {
}
