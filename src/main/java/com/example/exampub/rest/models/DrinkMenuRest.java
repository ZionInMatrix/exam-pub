package com.example.exampub.rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkMenuRest {
    private Integer id;
    private String productName;
    private Double price;
}
