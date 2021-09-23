package br.com.sbs.papirosrest.book;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class BookDTO {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String title;

    @JsonProperty
    private LocalDate releaseDate;

    @JsonProperty
    private int numberOfPages;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.releaseDate = book.getReleaseDate();
        this.numberOfPages = book.getNumberOfPages();
    }
}
