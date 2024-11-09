package edu.icet.service.impl;

import edu.icet.dto.BookAuthor;
import edu.icet.entity.BookAuthorEntity;
import edu.icet.repository.BookAuthorRepository;
import edu.icet.service.BookAuthorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookAuthorServiceImpl implements BookAuthorService {

    final BookAuthorRepository bookAuthorRepository;
    final ModelMapper modelMapper;

    @Override
    public void addBookAuthor(BookAuthor bookAuthor) {
        bookAuthorRepository.save(modelMapper.map(bookAuthor, BookAuthorEntity.class));
    }

    @Override
    public List<BookAuthor> getAllBookAuthors() {
        List<BookAuthor> bookAuthorList = new ArrayList<>();
        bookAuthorRepository.findAll().forEach(entity -> bookAuthorList.add(modelMapper.map(entity, BookAuthor.class)));
        return bookAuthorList;
    }

    @Override
    public Boolean deleteBookAuthor(Integer bookId, Integer authorId) {
        bookAuthorRepository.deleteByBookIdAndAuthorId(bookId, authorId);
        return true;

    }
}
