package com.bilgeadam.MovieAppJava5.controller;

import com.bilgeadam.MovieAppJava5.repository.entity.User;
import com.bilgeadam.MovieAppJava5.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    private User createUser(String name,String surname,String email,String phone,String password,String userType){

      return   userService.createUser(name,surname,email,phone,password,userType);
    }

}
