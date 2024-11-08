package edu.icet.service.impl;

import edu.icet.dto.Book;
import edu.icet.entity.BookEntity;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    final BookRepository repository;
    final ModelMapper mapper;

    @Override
    public void saveBook(Book book) {
        repository.save(mapper.map(book, BookEntity.class));
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        repository.findAll().forEach(entity -> bookList.add(mapper.map(entity, Book.class)));
        return bookList;
    }

    @Override
    public Book getBookById(Integer id) {
        return mapper.map(repository.findById(id).orElse(null), Book.class);
    }

    @Override
    public List<Book> getBooksByName(String name) {
        List<Book> bookList = new ArrayList<>();
        repository.findByNameContaining(name).forEach(entity -> bookList.add(mapper.map(entity, Book.class)));
        return bookList;
    }

    @Override
    public List<Book> getBooksByIsbn(String isbn) {
        List<Book> bookList = new ArrayList<>();
        repository.findByIsbn(isbn).forEach(entity -> bookList.add(mapper.map(entity, Book.class)));
        return bookList;
    }

    @Override
    public List<Book> getBooksByPublisherId(Long publisherId) {
        List<Book> bookList = new ArrayList<>();
        repository.findByPublisherId(publisherId).forEach(entity -> bookList.add(mapper.map(entity, Book.class)));
        return bookList;
    }

    @Override
    public List<Book> getBooksByMainCategoryId(Long mainCategoryId) {
        List<Book> bookList = new ArrayList<>();
        repository.findByMainCategoryId(mainCategoryId).forEach(entity -> bookList.add(mapper.map(entity, Book.class)));
        return bookList;
    }

    @Override
    public Boolean deleteBookById(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
