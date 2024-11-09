package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class BookRecord {
    private Integer id;
    private Integer bookId;
    private Integer memberId;
    private Date borrowedDate;
    private Date dueDate;
    private Date actualReturnDate;
    private Boolean isReturned;
}
