package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder, Long>{
    PaymentOrder findByPaymentLinkId(String paymentId);

}
