package com.main.controller;

import com.main.entity.Review;
import com.main.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company/{companyId}/review")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping
    public ResponseEntity<List<Review>> getAllReviewsofCompany(@PathVariable Long companyId)
    {
        List<Review> allReview = reviewService.getAllReview(companyId);
        return  new ResponseEntity<>(allReview, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Review> createReview(@PathVariable Long companyId,@RequestBody Review review)
    {
        Review reviews = reviewService.createReview(companyId, review);
        return  new ResponseEntity<>(reviews, HttpStatus.CREATED);
    }
    @GetMapping("/{reviewId}")
    public ResponseEntity<Optional<Review>> getReviewById(@PathVariable Long companyId, @PathVariable Long reviewId )
    {
        Optional<Review> reviewById = reviewService.getReviewById(companyId, reviewId);
        return  new ResponseEntity<>(reviewById, HttpStatus.OK);
    }

    @PutMapping("/{reviewId}")
    public ResponseEntity<Review> updateReviewById(@PathVariable Long companyId, @PathVariable Long reviewId , @RequestBody Review review)
    {
        Review reviewUpdated = reviewService.updateReview(companyId, reviewId, review);
        return  new ResponseEntity<>(reviewUpdated, HttpStatus.OK);
    }
}
