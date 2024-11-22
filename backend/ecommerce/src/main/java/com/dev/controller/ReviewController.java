package com.dev.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.Product;
import com.dev.model.Review;
import com.dev.model.User;
import com.dev.request.CreateReviewRequest;
import com.dev.response.ApiResponse;
import com.dev.service.ProductService;
import com.dev.service.ReviewService;
import com.dev.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class ReviewController {
    private final ReviewService reviewService;
    private final UserService userService;
    private final ProductService productService;

    @GetMapping("/products/{productId}/reviews")
    public ResponseEntity<List<Review>> getReviewsByProductId(
        @PathVariable Long productId
    ) throws Exception{
        List<Review> reviews = reviewService.getReviewByProductId(productId);
        return ResponseEntity.ok(reviews);
    }

    @PostMapping("/products/{productId}/reviews")
    public ResponseEntity<Review> createReviewByProductId(
        @PathVariable Long productId,
        @RequestHeader ("Authorization") String jwt,
        @RequestBody CreateReviewRequest req) throws Exception {
            
        User user = userService.findUserByJwtToken(jwt);
        Product product = productService.findProductById(productId);
        Review review = reviewService.CreateReview(req, user, product);
        return ResponseEntity.ok(review);
    }

    @PatchMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> updateReviewByReviewId(
        @PathVariable Long reviewId,
        @RequestHeader ("Authorization") String jwt,
        @RequestBody CreateReviewRequest req) throws Exception {
        
        User user = userService.findUserByJwtToken(jwt);

        Review review = reviewService.updateReview(
            reviewId,
            req.getReviewText(),
            req.getReviewRating(),
            user.getId()
        );

        return ResponseEntity.ok(review);
    }

    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<ApiResponse> deleteReviewByReviewId(
        @PathVariable Long reviewId,
        @RequestHeader ("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwtToken(jwt);
        reviewService.deleteReview(reviewId, user.getId());

        ApiResponse res = new ApiResponse();
        res.setMessage("Review deleted successfully");
        return ResponseEntity.ok(res);
    }
}
