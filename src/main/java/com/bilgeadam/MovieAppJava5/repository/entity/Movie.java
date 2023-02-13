package com.bilgeadam.MovieAppJava5.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Many to many
  //  List<Long> genresId;
    @ManyToMany(fetch = FetchType.LAZY)
   private   List<Genre> genres;
    private  String language;
    private  String image;
    private  String name;
    private  String country;
    private  double rating;
    @Lob
    private  String summary;
    private LocalDate premired;
    private String url;
    @OneToMany(mappedBy = "movie")
    private List<MovieComment> comments;
}
