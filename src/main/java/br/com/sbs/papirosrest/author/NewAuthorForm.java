package br.com.sbs.papirosrest.author;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class NewAuthorForm {

    private String email;
    private LocalDate birthDate;
    private String name;
    private String miniResume;

    public Author toEntity() {
        return new Author(email, birthDate, name, miniResume);
    }
}
