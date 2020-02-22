package com.microservices.movieinfoservice.controllers;

import com.microservices.movieinfoservice.models.Movie;
import com.microservices.movieinfoservice.services.MovieDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieDbService movieDbService;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {

        return movieDbService.getMovieFromDb(movieId);
    }
}
