package com.example.exampub.rest.models;

import com.example.exampub.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRest {
    private Integer id;
    private Integer user_ID;
    private List<OrderItem> orderItems;

    @Override
    public String toString() {
        return "OrderRest{" +
                "id=" + id +
                ", user_ID=" + user_ID +
                ", orderItems=" + orderItems +
                '}';
    }
}
