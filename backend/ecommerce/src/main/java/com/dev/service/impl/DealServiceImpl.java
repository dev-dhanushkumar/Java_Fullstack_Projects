package com.dev.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.Deal;
import com.dev.model.HomeCategory;
import com.dev.repository.DealRepository;
import com.dev.repository.HomeCategoryRepository;
import com.dev.service.DealService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class DealServiceImpl implements DealService{

    private final DealRepository dealRepository;
    private final HomeCategoryRepository homeCategoryRepository;

    @Override
    public List<Deal> getDeals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeals'");
    }

    @Override
    public Deal createDeal(Deal deal) {
        HomeCategory category = homeCategoryRepository.findById(deal.getCategory().getId()).orElse(null);

        Deal newDeal = dealRepository.save(deal);
        newDeal.setCategory(category);
        newDeal.setDiscount(deal.getDiscount());

        return dealRepository.save(newDeal);
    }

    @Override
    public Deal updateDeal(Deal deal, Long id) throws Exception {
        Deal existingdeal = dealRepository.findById(id).orElse(null);
        HomeCategory category = homeCategoryRepository.findById(deal.getCategory().getId()).orElseThrow(() ->
            new Exception("Deal not found!"));

        if(existingdeal != null) {
            if(deal.getDiscount() != null) {
                existingdeal.setDiscount(deal.getDiscount());
            }
            if(category != null) {
                existingdeal.setCategory(category);
            }
            return dealRepository.save(existingdeal);
        }
        throw new Exception("Deal not found");
    }

    @Override
    public void deletedeal(Long id) throws Exception {
        Deal deal = dealRepository.findById(id).orElseThrow(()-> new Exception("Deal not found!"));

        dealRepository.delete(deal);
    }
    
}
