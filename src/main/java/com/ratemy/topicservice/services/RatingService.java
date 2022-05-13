package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Rating;
import com.ratemy.topicservice.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepository repository;

    public Optional<Rating> getRatingById(Long id) {
        return repository.findById(id);
    }

    public Rating updateRating(Rating rating) {
        return repository.save(rating);
    }

    public Rating addRating(Rating rating) {
        return repository.save(rating);
    }

    public List<Rating> finaAllRatings() {
        return repository.findAll();
    }

    public List<Rating> findAllRatingsById(List<Long> ids) {
        return repository.findAllById(ids);
    }

    public void deleteRatingById(Long id) {
        repository.deleteById(id);
    }

    public void deleteAllRatingsById(List<Long> ids) {
        repository.deleteAllById(ids);
    }
}
