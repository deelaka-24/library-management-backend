package edu.icet.controller;

import edu.icet.dto.BookRecord;
import edu.icet.service.BookRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-record")
@RequiredArgsConstructor
@CrossOrigin
public class BookRecordController {

    final BookRecordService bookRecordService;

    @PostMapping("/save-book-record")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBookRecord(@RequestBody BookRecord bookRecord) {
        bookRecordService.saveBookRecord(bookRecord);
    }

    @PutMapping("/update-book-record")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBookRecord(@RequestBody BookRecord bookRecord) {
        bookRecordService.updateBookRecord(bookRecord);
    }

    @GetMapping("/view-all-book-records")
    @ResponseStatus(HttpStatus.OK)
    public List<BookRecord> getAllBookRecords() {
        return bookRecordService.getAllBookRecords();
    }

    @GetMapping("/get-book-record-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BookRecord getBookRecordById(@PathVariable Integer id) {
        return bookRecordService.getBookRecordById(id);
    }

    @DeleteMapping("/delete-book-record/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteBookRecord(@PathVariable Integer id) {
        return bookRecordService.deleteBookRecordById(id);
    }
}
