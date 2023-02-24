package com.bilgeadam.MovieAppJava5.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum ErrorType {
    INTERNAL_ERROR(5100,"Sunucu Hatasý",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4100,"Parametre Hatasý",HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4110,"Boyle Bir kullanýcý bulunamadý",HttpStatus.BAD_REQUEST),
    USER_NOT_CREATED(4111,"Kullanýcý olusturulamadý",HttpStatus.BAD_REQUEST),
    MOVIE_NOT_FOUND(4120,"Boyle bir film bulunamadý",HttpStatus.BAD_REQUEST);

  private   int code;
  private   String message;
    HttpStatus httpStatus;


}
