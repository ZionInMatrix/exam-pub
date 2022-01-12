package com.example.exampub.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "drink_menu")
public class DrinkMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false, precision = 12, scale = 2)
    private Double price;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean isForAdult;

    @OneToMany(mappedBy = "drinkMenu")
    private List<OrderItem> orderItems;

}
