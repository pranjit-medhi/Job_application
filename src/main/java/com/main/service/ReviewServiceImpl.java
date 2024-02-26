package com.main.service;

import com.main.entity.Company;
import com.main.entity.Review;
import com.main.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReview(Long companyId) {
        return reviewRepository.findByCompanyCompanyId(companyId);
    }

    @Override
    public Review createReview(Long companyId, Review review) {
        Company companyById = companyService.findCompanyById(companyId).get();
        review.setCompany(companyById);
        Review savedReview = reviewRepository.save(review);
        return savedReview;
    }

    @Override
    public Optional<Review> getReviewById(Long companyId, Long reviewId) {
        return reviewRepository.findById(reviewId);
    }

    @Override
    public Review updateReview(Long companyId, Long reviewId, Review review) {
            review.setDescription(review.getDescription());
            review.setTitle(review.getDescription());
            return reviewRepository.save(review);
    }
}
