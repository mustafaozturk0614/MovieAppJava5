package com.bilgeadam.MovieAppJava5.dto.response;

import com.bilgeadam.MovieAppJava5.repository.entity.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegisterResponseDto {
    private Long id;
    private String name;
    private String surName;
    private String email;
    private UserType userType;
}
