package com.example.mobiliteinternational.service.rating;

import com.example.mobiliteinternational.entity.Rating;
import com.example.mobiliteinternational.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("Rating")
@AllArgsConstructor
public class RatingService implements IRatingService{

    private final RatingRepository ratingRepository;

    @Override
    public Rating addRating(Rating rating) {
        return null;
    }

    @Override
    public Rating UpdateRating(Rating rating) {
        return null;
    }

    @Override
    public void deleteRating(int idrating) {

    }

    @Override
    public List<Rating> findAllRating() {
        return null;
    }

    @Override
    public Rating findByIdRating(int idRating) {
        return null;
    }
}
