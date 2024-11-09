package edu.icet.service.impl;

import edu.icet.dto.BookRecord;
import edu.icet.entity.BookRecordEntity;
import edu.icet.repository.BookRecordRepository;
import edu.icet.service.BookRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookRecordServiceImpl implements BookRecordService {

    final BookRecordRepository bookRecordRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveBookRecord(BookRecord bookRecord) {
        bookRecordRepository.save(modelMapper.map(bookRecord, BookRecordEntity.class));
    }

    @Override
    public void updateBookRecord(BookRecord bookRecord) {
        bookRecordRepository.save(modelMapper.map(bookRecord, BookRecordEntity.class));
    }

    @Override
    public List<BookRecord> getAllBookRecords() {
        List<BookRecord> bookRecordList = new ArrayList<>();
        bookRecordRepository.findAll().forEach(entity -> bookRecordList.add(modelMapper.map(entity, BookRecord.class)));
        return bookRecordList;
    }

    @Override
    public BookRecord getBookRecordById(Integer id) {
        return modelMapper.map(bookRecordRepository.findById(id).orElse(null), BookRecord.class);
    }

    @Override
    public Boolean deleteBookRecordById(Integer id) {
        bookRecordRepository.deleteById(id);
        return true;
    }
}
