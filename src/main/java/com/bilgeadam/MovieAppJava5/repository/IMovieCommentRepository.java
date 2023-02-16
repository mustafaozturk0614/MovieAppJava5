package com.bilgeadam.MovieAppJava5.repository;

import com.bilgeadam.MovieAppJava5.repository.entity.Movie;
import com.bilgeadam.MovieAppJava5.repository.entity.MovieComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface IMovieCommentRepository extends JpaRepository<MovieComment,Long> {


    @Query("select  m from MovieComment  as m where m.movie.id=?1")
    List<MovieComment> findAllByMyMovies(Long movieId);
    List<MovieComment> findAllByMovie_Id(Long movieId);
    List<MovieComment> findAllByMovie_Name(String name);
    List<MovieComment> findAllByMovie(Movie movie);

    List<MovieComment> findAllByUser_Id(Long userId);



}
