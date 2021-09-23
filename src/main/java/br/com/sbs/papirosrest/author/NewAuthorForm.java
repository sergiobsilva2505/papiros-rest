package br.com.sbs.papirosrest.author;

import java.time.LocalDate;

public record NewAuthorForm (String email, LocalDate birthDate, String name, String miniResume) {

    public Author toEntity() {
        return new Author(email, birthDate, name, miniResume);
    }
}
