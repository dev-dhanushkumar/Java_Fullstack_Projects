package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long>{
    
    Coupon findByCode(String code);
}
