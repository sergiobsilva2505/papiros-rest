package br.com.sbs.papirosrest.author;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public ResponseEntity<List<Author>> findAll(){
        List<Author> authors = authorRepository.findAll();
        return ResponseEntity.ok().body(authors);
    }
}
