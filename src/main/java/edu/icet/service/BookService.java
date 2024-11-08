package edu.icet.service;

import edu.icet.dto.Book;

import java.util.List;

public interface BookService {
    void saveBook(Book book);
    List<Book> getAllBooks();
    Boolean deleteBookById(Integer id);
    Book getBookById(Integer id);
    List<Book> getBooksByName(String name);
    List<Book> getBooksByIsbn(String isbn);
    List<Book> getBooksByPublisherId(Long publisherId);
    List<Book> getBooksByMainCategoryId(Long mainCategoryId);
}
