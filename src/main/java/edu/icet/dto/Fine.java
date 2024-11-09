package edu.icet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fine {
    private Integer id;
    private Double amount;
    private Integer dateCount;
    private Integer bookRecordId;
    private Integer adminId;
    private Boolean isPaid;
}
