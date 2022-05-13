package com.ratemy.topicservice.services;

import com.ratemy.topicservice.entities.Rating;
import com.ratemy.topicservice.repositories.RatingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class RatingServiceTest {
    @Mock
    private RatingRepository ratingRepository;
    @InjectMocks
    private RatingService underTest;

    @Test
    void getRatingById() {
        //when
        underTest.getRatingById(1l);
        //then
        verify(ratingRepository).findById(1l);
    }

    @Test
    void updateRating() {
        Rating rating = new Rating();
        //when
        underTest.updateRating(rating);
        //then
        verify(ratingRepository).save(rating);
    }

    @Test
    void addRating() {
        Rating rating = new Rating();
        //when
        underTest.addRating(rating);
        //then
        verify(ratingRepository).save(rating);
    }

    @Test
    void getAllRatingsById() {
        List<Long> ids = List.of(1l, 2l, 3l, 4l, 5l);
        //when
        underTest.findAllRatingsById(ids);
        //then
        verify(ratingRepository).findAllById(ids);
    }

    @Test
    void deleteRatingsById() {
        //when
        underTest.deleteRatingById(1l);
        //then
        verify(ratingRepository).deleteById(1l);
    }

    @Test
    void deleteAllRatingsById() {
        List<Long> ids = List.of(1l, 2l, 3l, 4l, 5l);
        //when
        underTest.deleteAllRatingsById(ids);
        //then
        verify(ratingRepository).deleteAllById(ids);
    }
}
