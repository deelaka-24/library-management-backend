package edu.icet.service.impl;

import edu.icet.dto.Author;
import edu.icet.entity.AuthorEntity;
import edu.icet.repository.AuthorRepository;
import edu.icet.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    final AuthorRepository authorRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(modelMapper.map(author, AuthorEntity.class));
    }

    @Override
    public List<Author> getAllAuthors() {
        List<Author> authorList = new ArrayList<>();
        authorRepository.findAll().forEach(entity -> authorList.add(modelMapper.map(entity, Author.class)));
        return authorList;
    }

    @Override
    public Author getAuthorById(Integer id) {
        return modelMapper.map(authorRepository.findById(id).orElse(null), Author.class);
    }

    @Override
    public Boolean deleteAuthorById(Integer id) {
        authorRepository.deleteById(id);
        return true;
    }
}
