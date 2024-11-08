package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Publisher {
    private Integer id;
    private String name;
    private String location;
    private String contact;
}
