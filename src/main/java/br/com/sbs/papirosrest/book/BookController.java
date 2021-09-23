package br.com.sbs.papirosrest.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> findAll(){
        List<Book> books = bookRepository.findAll();
        List<BookDTO> bookDTOS = books.stream().map(BookDTO::new).toList();
        return ResponseEntity.ok().body(bookDTOS);
    }
}
