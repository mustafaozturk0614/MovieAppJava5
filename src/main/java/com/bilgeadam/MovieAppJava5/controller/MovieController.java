package com.bilgeadam.MovieAppJava5.controller;

import com.bilgeadam.MovieAppJava5.repository.entity.Movie;
import com.bilgeadam.MovieAppJava5.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/findall")
    public ResponseEntity<List<Movie>> findAll(){
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/findbyrate")
    public   ResponseEntity<List<Movie>>  findAllByRatingGreaterThan(double rate){
        return ResponseEntity.ok(movieService.findAllByRatingGreaterThan(rate));
    }
    @GetMapping("/findbyusersgenres")
    public ResponseEntity<List<Movie>>  findMoviesByUsersGenres(Long id){
        return ResponseEntity.ok(movieService.findMoviesByUsersGenres(id));
    }


}
