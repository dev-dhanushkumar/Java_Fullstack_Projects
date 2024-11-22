package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.SellerReport;

public interface SellerReportRepository extends JpaRepository<SellerReport, Long>{
    SellerReport findBySellerId(Long sellerId);
}
