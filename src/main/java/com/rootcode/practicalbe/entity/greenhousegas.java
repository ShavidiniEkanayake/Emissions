package com.rootcode.practicalbe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class greenhousegas {
    @Id
    private String sector;
    private String year;
    private String statistic_code;
    private String statistic;
    private Float value;
}
