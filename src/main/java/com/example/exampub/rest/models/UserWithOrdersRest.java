package com.example.exampub.rest.models;

import com.example.exampub.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithOrdersRest {
    private Integer id;
    private String name;
    private Double pocket;
    private Boolean isActive;
    private Integer isAdult;
    private List<Order> order;
}
