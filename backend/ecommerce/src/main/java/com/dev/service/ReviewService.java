package com.dev.service;

import java.util.List;

import com.dev.model.Product;
import com.dev.model.Review;
import com.dev.model.User;
import com.dev.request.CreateReviewRequest;

public interface ReviewService {
    
    Review CreateReview(CreateReviewRequest req, User user, Product product);

    List<Review> getReviewByProductId(Long productId);

    Review updateReview(Long reviewId, String ReviewText, double rating, Long userId) throws Exception;

    Void deleteReview(Long reviewId, Long userId) throws Exception;

    Review getReviewById(Long reviewId) throws Exception;

}
