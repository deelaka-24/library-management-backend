package edu.icet.repository;

import edu.icet.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {
    List<BookEntity> findByNameContaining(String name);
    List<BookEntity> findByIsbn(String isbn);
    List<BookEntity> findByPublisherId(Long publisherId);
    List<BookEntity> findByMainCategoryId(Long mainCategoryId);
}
