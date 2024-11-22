package com.dev.service;

import java.util.List;

import com.dev.model.Deal;

public interface DealService {
    
    List<Deal> getDeals();

    Deal createDeal(Deal deal);

    Deal updateDeal(Deal deal, Long id) throws Exception;

    void deletedeal(Long id) throws Exception;
}
