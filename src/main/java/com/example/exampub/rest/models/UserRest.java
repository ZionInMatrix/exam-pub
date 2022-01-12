package com.example.exampub.rest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRest {
    private Integer id;
    private String name;
    private Double pocket;
    private Boolean isActive;
    private Integer isAdult;


}
