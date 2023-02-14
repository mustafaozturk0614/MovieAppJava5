package com.bilgeadam.MovieAppJava5.service;

import com.bilgeadam.MovieAppJava5.repository.IMovieRepository;
import com.bilgeadam.MovieAppJava5.repository.IUserRepository;
import com.bilgeadam.MovieAppJava5.repository.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final IMovieRepository movieRepository;


    public Movie save(Movie movie) {

        return movieRepository.save(movie);
    }

    public List<Movie> findAllByIds(List<Long> ids) {
      return   ids.stream().map(x->movieRepository.findById(x).get()).collect(Collectors.toList());
    }

    public Movie findbyId(long id) {
        Optional<Movie> movie=movieRepository.findById(id);
        if (movie.isPresent()){
            return movie.get();
        }else{
            throw  new RuntimeException("KLullanýcý bulunamadý");
        }
    }

    public List<Movie> findAll() {
        return  movieRepository.findAll();
    }
}
