package com.bilgeadam.MovieAppJava5.service;

import com.bilgeadam.MovieAppJava5.repository.IMovieCommentRepository;
import com.bilgeadam.MovieAppJava5.repository.IMovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieCommentService {

    private final IMovieCommentRepository movieCommentRepository;



}
