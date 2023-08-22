package com.hongsam.hongflix.admin.domain;

import lombok.Data;

@Data
public class ContentCreateResDto {

    private Long id;
    private Long movieId;

    private String title;
    private String explanation;
    private String movieName;


    public ContentCreateResDto(Long id, Long movieId, String title, String explanation, String movieName) {
        this.id = id;
        this.movieId = movieId;
        this.title = title;
        this.explanation = explanation;
        this.movieName = movieName;
    }
}
