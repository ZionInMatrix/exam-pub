package com.example.exampub.rest.models;

import com.example.exampub.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkMenuRest {
    private Integer id;
    private String productName;
    private Double price;
    private Boolean isForAdult;
    private List<OrderItem> orderItems;

    @Override
    public String toString() {
        return "DrinkMenuRest{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", isForAdult=" + isForAdult +
                ", orderItems=" + orderItems +
                '}';
    }
}
