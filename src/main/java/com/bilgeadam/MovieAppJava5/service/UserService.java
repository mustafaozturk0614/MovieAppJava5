package com.bilgeadam.MovieAppJava5.service;

import com.bilgeadam.MovieAppJava5.repository.IMovieRepository;
import com.bilgeadam.MovieAppJava5.repository.IUserRepository;
import com.bilgeadam.MovieAppJava5.repository.entity.User;
import com.bilgeadam.MovieAppJava5.repository.entity.UserType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public User createUser(String name, String surname, String email, String phone, String password, String userType) {
        UserType userType1=null;
        User user;
       try {
           userType1=UserType.valueOf(userType);
           user= User.builder()
                   .name(name)
                   .surName(surname)
                   .email(email)
                   .phone(phone)
                   .userType(userType1)
                   .password(password)
                   .build();
       }catch (Exception e){
           System.out.println("Boyle bir Kullanýcý turu bulunmamaktadýr");
           user= User.builder()
                   .name(name)
                   .surName(surname)
                   .email(email)
                   .phone(phone)
                   .password(password)
                   .build();
       }


       return  userRepository.save(user);

    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void saveAll(List<User> users) {

        userRepository.saveAll(users);


    }
}
