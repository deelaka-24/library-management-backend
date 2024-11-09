package edu.icet.controller;

import edu.icet.dto.BookAuthor;
import edu.icet.service.BookAuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-author")
@RequiredArgsConstructor
@CrossOrigin
public class BookAuthorController {

    final BookAuthorService bookAuthorService;

    @PostMapping("/add-book-author")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBookAuthor(@RequestBody BookAuthor bookAuthor) {
        bookAuthorService.addBookAuthor(bookAuthor);
    }

    @GetMapping("/view-all-book-authors")
    @ResponseStatus(HttpStatus.OK)
    public List<BookAuthor> getAllBookAuthors() {
        return bookAuthorService.getAllBookAuthors();
    }

    @DeleteMapping("/delete-book-author")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteBookAuthor(@RequestParam Integer bookId, @RequestParam Integer authorId) {
        return bookAuthorService.deleteBookAuthor(bookId, authorId);
    }
}
