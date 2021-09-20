package br.com.sbs.papirosrest.author;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.*;
import java.net.URI;
import java.util.*;

import static java.lang.String.format;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public ResponseEntity<List<AuthorDTO>> findAll(){
        List<Author> authors = authorRepository.findAll();
        return ResponseEntity.ok().body(AuthorDTO.fromEntity(authors));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody NewAuthorForm newAuthorForm) {
        Optional<Author> author = authorRepository.findByEmail(newAuthorForm.getEmail());
        if(author.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, newAuthorForm.getEmail());
        }
        Author newAuthor = newAuthorForm.toEntity();
        newAuthor = authorRepository.save(newAuthor);
        URI location = URI.create(format("authors/%s", newAuthor.getId()));
        return ResponseEntity.created(location).build();
    }
}
