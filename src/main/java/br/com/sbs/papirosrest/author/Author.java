package br.com.sbs.papirosrest.author;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private LocalDate birthDate;
    private String name;
    private String miniResume;

    @Deprecated
    public Author() {
    }

    public Author(String email, LocalDate birthDate, String name, String miniResume) {
        this.email = email;
        this.birthDate = birthDate;
        this.name = name;
        this.miniResume = miniResume;
    }

}
