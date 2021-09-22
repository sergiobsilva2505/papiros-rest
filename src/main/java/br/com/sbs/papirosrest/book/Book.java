package br.com.sbs.papirosrest.book;

import br.com.sbs.papirosrest.author.Author;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate releaseDate;
    private int numberOfPages;

    @ManyToMany(mappedBy = "books")
    private Set<Author> author = new HashSet<>();

    @Deprecated
    public Book() {
    }

    public Book(String title, LocalDate releaseDate, int numberOfPages) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.numberOfPages = numberOfPages;
    }

}
