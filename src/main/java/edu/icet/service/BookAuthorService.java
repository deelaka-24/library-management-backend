package edu.icet.service;

import edu.icet.dto.BookAuthor;

import java.util.List;

public interface BookAuthorService {
    void addBookAuthor(BookAuthor bookAuthor);
    List<BookAuthor> getAllBookAuthors();
    Boolean deleteBookAuthor(Integer bookId, Integer authorId);
}
