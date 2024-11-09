package edu.icet.repository;

import edu.icet.entity.BookRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRecordRepository extends JpaRepository<BookRecordEntity, Integer> {
}
