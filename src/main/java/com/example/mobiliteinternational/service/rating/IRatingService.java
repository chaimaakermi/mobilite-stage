package com.example.mobiliteinternational.service.rating;

import com.example.mobiliteinternational.entity.Rating;

import java.util.List;

public interface IRatingService {
    public Rating addRating(Rating rating);

    public Rating UpdateRating(Rating rating);

    public void deleteRating(int idrating);

    public List<Rating> findAllRating();

    public Rating findByIdRating(int idRating);
}
