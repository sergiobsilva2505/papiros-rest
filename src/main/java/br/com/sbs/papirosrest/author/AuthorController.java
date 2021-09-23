package br.com.sbs.papirosrest.author;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<List<AuthorDTO>> findAll() {
        List<Author> authors = authorRepository.findAll();
        List<AuthorDTO> authorDTOS = authors.stream().map(AuthorDTO::new).toList();
        return ResponseEntity.ok().body(authorDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> findById(@PathVariable Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        AuthorDTO authorDTO = new AuthorDTO(author);
        return ResponseEntity.ok().body(authorDTO);
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody NewAuthorForm newAuthorForm) {
        Optional<Author> author = authorRepository.findByEmail(newAuthorForm.email());
        if (author.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, newAuthorForm.email());
        }
        Author newAuthor = newAuthorForm.toEntity();
        newAuthor = authorRepository.save(newAuthor);
        URI location = URI.create(format("authors/%s", newAuthor.getId()));
        return ResponseEntity.created(location).build();
    }
}
