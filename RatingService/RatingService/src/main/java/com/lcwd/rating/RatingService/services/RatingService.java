package com.lcwd.rating.RatingService.services;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getRatings();
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);


}
