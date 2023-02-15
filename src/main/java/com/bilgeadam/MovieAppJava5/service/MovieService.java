package com.bilgeadam.MovieAppJava5.service;

import com.bilgeadam.MovieAppJava5.repository.IMovieRepository;
import com.bilgeadam.MovieAppJava5.repository.IUserRepository;
import com.bilgeadam.MovieAppJava5.repository.entity.Genre;
import com.bilgeadam.MovieAppJava5.repository.entity.Movie;
import com.bilgeadam.MovieAppJava5.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final IMovieRepository movieRepository;

    private final UserService userService;


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

    public  List<Movie> findAllByRatingGreaterThan(double rate){

        return movieRepository.findAllByRatingGreaterThan(rate);
    }

    public List<Movie> findMoviesByUsersGenres(Long id){
        Optional<User> user= userService.findById(id);
        if (user.isPresent()){
            List<Genre> genres=user.get().getFavGenres();
            return  movieRepository.findAllByGenresInOrderByRatingDesc(genres);
        }else{
            throw new RuntimeException("Kullanýcý bulunamadý");
        }
    }
}
