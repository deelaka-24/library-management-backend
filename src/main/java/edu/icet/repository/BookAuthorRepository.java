package edu.icet.repository;

import edu.icet.entity.BookAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface BookAuthorRepository extends JpaRepository<BookAuthorEntity, Integer> {
    @Transactional
    void deleteByBookIdAndAuthorId(Integer bookId, Integer authorId);
}
