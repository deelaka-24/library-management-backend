package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Author {
    private Integer id;
    private String name;
    private String contact;
}
