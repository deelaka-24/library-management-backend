package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Admin {
    private Integer id;
    private String username;
    private String email;
    private String password;
}
