package br.com.sbs.papirosrest.author;

import br.com.sbs.papirosrest.book.Book;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

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

    @ManyToMany
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> books = new HashSet<>();

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
