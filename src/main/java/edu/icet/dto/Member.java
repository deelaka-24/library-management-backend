package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
    private Integer id;
    private String name;
    private String address;
    private String email;
    private String phone;
}
