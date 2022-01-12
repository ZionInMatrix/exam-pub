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
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Boolean isActive;

    @Column(nullable = false)
    private Integer isAdult;

    @Column(nullable = false, precision = 12, scale = 2)
    private Double pocket;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Order> order;
}
