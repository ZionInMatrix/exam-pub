package com.example.exampub.repositories;

import com.example.exampub.entity.DrinkMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkMenuRepository extends JpaRepository<DrinkMenu, Integer> {
}
