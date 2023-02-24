package com.bilgeadam.MovieAppJava5.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum ErrorType {
    INTERNAL_ERROR(5100,"Sunucu Hatas�",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4100,"Parametre Hatas�",HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4110,"Boyle Bir kullan�c� bulunamad�",HttpStatus.BAD_REQUEST),
    USER_NOT_CREATED(4111,"Kullan�c� olusturulamad�",HttpStatus.BAD_REQUEST),
    MOVIE_NOT_FOUND(4120,"Boyle bir film bulunamad�",HttpStatus.BAD_REQUEST);

  private   int code;
  private   String message;
    HttpStatus httpStatus;


}
