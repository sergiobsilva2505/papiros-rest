package br.com.sbs.papirosrest.author;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;


public class AuthorDTO {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String email;

    @JsonProperty
    private LocalDate birthDate;

    @JsonProperty
    private String name;

    @JsonProperty
    private String miniResume;

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.email = author.getEmail();
        this.birthDate = author.getBirthDate();
        this.name = author.getName();
        this.miniResume = author.getMiniResume();
    }

}
