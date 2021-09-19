package br.com.sbs.papirosrest.author;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class AuthorDTO {

    private String email;
    private LocalDate birthDate;
    private String name;
    private String miniResume;

    @Deprecated
    public AuthorDTO() {
    }

    public AuthorDTO(Author author) {
        this.email = author.getEmail();
        this.birthDate = author.getBirthDate();
        this.name = author.getName();
        this.miniResume = author.getMiniResume();
    }

    public static List<AuthorDTO> fromEntity(List<Author> authors) {
        return authors.stream().map(AuthorDTO::new).toList();
    }
}
