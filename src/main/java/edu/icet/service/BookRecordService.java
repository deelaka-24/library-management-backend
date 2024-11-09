package edu.icet.service;

import edu.icet.dto.BookRecord;

import java.util.List;

public interface BookRecordService {
    void saveBookRecord(BookRecord bookRecord);
    void updateBookRecord(BookRecord bookRecord);
    List<BookRecord> getAllBookRecords();
    BookRecord getBookRecordById(Integer id);
    Boolean deleteBookRecordById(Integer id);
}
