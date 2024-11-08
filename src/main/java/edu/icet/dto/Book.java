package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {
    private Integer id;
    private String name;
    private String isbn;
    private Double price;
    private Long publisherId;
    private Long mainCategoryId;
}
