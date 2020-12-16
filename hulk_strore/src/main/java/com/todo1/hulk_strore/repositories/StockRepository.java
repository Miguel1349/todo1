package com.todo1.hulk_strore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo1.hulk_strore.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
