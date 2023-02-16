package com.bilgeadam.MovieAppJava5.repository;

import com.bilgeadam.MovieAppJava5.repository.entity.Genre;
import com.bilgeadam.MovieAppJava5.repository.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public interface IMovieRepository extends JpaRepository<Movie,Long> {



    List<Movie> findAllByRatingGreaterThan(double rate);


    List<Movie> findAllByGenresInOrderByRatingDesc(List<Genre> genres);

    List<Movie>  findAllByPremieredBefore(LocalDate date);


    @Query("select count(m.rating) ,m.rating from Movie as m group by m.rating having m.rating=?1")
    Object [] searchByRating(double rating);
    @Query("select count(m.rating) ,m.rating from Movie as m group by m.rating ")
    List<Object> searchByRating();

}
