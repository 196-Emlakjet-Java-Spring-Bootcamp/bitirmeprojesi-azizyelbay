package com.azizyelbay.reportservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {

    private Long id;
    private Long advertisementId;
    private String userName;
    private Long visitCounter;
    private String reportText;
}
