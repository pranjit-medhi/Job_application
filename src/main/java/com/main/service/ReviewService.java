package com.main.service;

import com.main.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<Review> getAllReview(Long companyId);
    Review createReview(Long companyId, Review review);
    Optional<Review> getReviewById(Long companyId, Long reviewId);
    Review updateReview(Long companyId, Long reviewId, Review review);

}
