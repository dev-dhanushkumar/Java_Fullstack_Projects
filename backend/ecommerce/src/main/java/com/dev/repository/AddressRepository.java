package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
