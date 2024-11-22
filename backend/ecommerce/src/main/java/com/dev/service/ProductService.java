package com.dev.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.dev.exceptions.ProductException;
import com.dev.model.Product;
import com.dev.model.Seller;
import com.dev.request.CreateProductRequest;

public interface ProductService {
    public Product createProduct(CreateProductRequest req, Seller seller);
    public void deleteProduct(Long productId) throws ProductException;
    public Product updateProduct(Long productId, Product product) throws ProductException;
    public Product findProductById(Long productId) throws ProductException;
    List<Product> searchProduct(String query);
    public Page<Product> getAllProducts(String category, String brand, String colors,
        String sizes, Integer minPrice, Integer maxPrice, Integer minDiscount,
        String sort, String stock, Integer pageNumber
    );

    List<Product> getProductBySellerId(Long sellerId);
}
