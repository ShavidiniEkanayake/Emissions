package com.rootcode.practicalbe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GreenhousegasDTO {
    private String sector;
    private String year;
    private String statistic_code;
    private String statistic;
    private Float value;
}
