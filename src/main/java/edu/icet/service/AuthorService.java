package edu.icet.service;

import edu.icet.dto.Author;

import java.util.List;

public interface AuthorService {
    void saveAuthor(Author author);
    List<Author> getAllAuthors();
    Author getAuthorById(Integer id);
    Boolean deleteAuthorById(Integer id);
}
