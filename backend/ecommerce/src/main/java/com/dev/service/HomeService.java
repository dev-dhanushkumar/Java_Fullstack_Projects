package com.dev.service;

import java.util.List;

import com.dev.model.Home;
import com.dev.model.HomeCategory;

public interface HomeService {
    
    public Home createHomePageData(List<HomeCategory> allCategories);

    
}
