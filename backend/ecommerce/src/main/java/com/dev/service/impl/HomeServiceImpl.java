package com.dev.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dev.domain.HomeCategorySection;
import com.dev.model.Deal;
import com.dev.model.Home;
import com.dev.model.HomeCategory;
import com.dev.repository.DealRepository;
import com.dev.service.HomeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final DealRepository dealRepository;

    @Override
    public Home createHomePageData(List<HomeCategory> allCategories) {
        List<HomeCategory> gridCategories = allCategories.stream()
                .filter(category -> 
                    category.getSection() == HomeCategorySection.GRID)
                    .collect(Collectors.toList()
                );

        List<HomeCategory> shopByCategories = allCategories.stream()
                .filter(category ->
                category.getSection() == HomeCategorySection.SHOP_BY_CATEGORIES)
                .collect(Collectors.toList()
                );

        List<HomeCategory> electricCategory = allCategories.stream()
                .filter(category ->
                category.getSection() == HomeCategorySection.ELECTRIC_CATEGORIES)
                .collect(Collectors.toList()
                );

        List<HomeCategory> dealCategories = allCategories.stream()
        .filter(category ->
        category.getSection() == HomeCategorySection.DEALS)
        .toList();

        List<Deal> createdDeals = new ArrayList<>();

        if (dealRepository.findAll().isEmpty()) {
            List<Deal> deals = allCategories.stream()
                    .filter(category -> category.getSection() == HomeCategorySection.DEALS)
                    .map(category -> new Deal(null, 10, category))
                    .collect(Collectors.toList());
                createdDeals = dealRepository.saveAll(deals);
        } else {
            createdDeals = dealRepository.findAll();
        }

        Home home = new Home();
        home.setGrid(gridCategories);
        home.setShopByCategories(shopByCategories);
        home.setElectricCategories(electricCategory);
        home.setDeals(createdDeals);
        home.setDealCategories(dealCategories);
        
        return home;
    }

}
