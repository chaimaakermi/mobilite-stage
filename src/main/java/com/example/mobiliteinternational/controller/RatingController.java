package com.example.mobiliteinternational.controller;

import com.example.mobiliteinternational.entity.Rating;
import com.example.mobiliteinternational.service.rating.IRatingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rating")
public class RatingController {

    private final IRatingService ratingService;

    @PostMapping("/ajouterRating")
    public Rating ajouterRating(@RequestBody Rating rating) {
        return ratingService.addRating(rating);
    }


    @PutMapping("/modifierRating")
    public Rating UpdateRating(@RequestBody Rating rating) {
        return ratingService.UpdateRating(rating);
    }

    @DeleteMapping("/supprimerRating/{idRating}")
    public void deleteRating(@PathVariable("idRating") int idRating) {
        ratingService.deleteRating(idRating);

    }

    @GetMapping("/afficherAllRating")
    public List<Rating> findAllRating() {
        return ratingService.findAllRating();
    }


    @GetMapping("/afficherRating/{idR}")
    public Rating findByIdRating(@PathVariable("idR") int idRating) {
        return ratingService.findByIdRating(idRating);

    }


}
