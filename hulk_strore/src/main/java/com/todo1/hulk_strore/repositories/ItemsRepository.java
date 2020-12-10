package com.todo1.hulk_strore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo1.hulk_strore.entities.Item;

public interface ItemsRepository extends JpaRepository<Item, Long> {

}
