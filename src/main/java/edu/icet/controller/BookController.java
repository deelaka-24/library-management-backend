package edu.icet.controller;

import edu.icet.dto.Book;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin
public class BookController {
    final BookService bookService;

    @PostMapping("/save-book")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @PutMapping("/update-book")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @GetMapping("/view-all-books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/delete-book-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteBook(@PathVariable Integer id) {
        return bookService.deleteBookById(id);
    }

    @GetMapping("/get-book-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/get-book-by-name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooksByName(@PathVariable String name) {
        return bookService.getBooksByName(name);
    }

    @GetMapping("/get-book-by-isbn/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooksByIsbn(@PathVariable String isbn) {
        return bookService.getBooksByIsbn(isbn);
    }

    @GetMapping("/get-book-by-publisher-id/{publisherId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooksByPublisherId(@PathVariable Long publisherId) {
        return bookService.getBooksByPublisherId(publisherId);
    }

    @GetMapping("/get-book-by-main-category-id/{mainCategoryId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooksByMainCategoryId(@PathVariable Long mainCategoryId) {
        return bookService.getBooksByMainCategoryId(mainCategoryId);
    }
}
