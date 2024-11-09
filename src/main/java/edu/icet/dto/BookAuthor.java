package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookAuthor {
    private Integer bookId;
    private Integer authorId;
}
