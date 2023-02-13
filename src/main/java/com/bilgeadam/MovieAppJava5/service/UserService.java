package com.bilgeadam.MovieAppJava5.service;

import com.bilgeadam.MovieAppJava5.repository.IMovieRepository;
import com.bilgeadam.MovieAppJava5.repository.IUserRepository;
import com.bilgeadam.MovieAppJava5.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;


    public User createUser(String name, String surname, String email, String phone, String password, String userType) {


    }
}
