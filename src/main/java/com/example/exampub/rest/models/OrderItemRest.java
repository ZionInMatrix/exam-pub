package com.example.exampub.rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemRest {
    private Integer id;
    private Integer order_ID;
    private Integer drinkMenu_ID;
    private Double amount;
    private Double price;
}
