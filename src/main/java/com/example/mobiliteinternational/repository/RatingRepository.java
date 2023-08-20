package com.example.mobiliteinternational.repository;

import com.example.mobiliteinternational.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}