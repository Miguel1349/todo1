package com.todo1.hulk_strore.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo1.hulk_strore.entities.Item;
import com.todo1.hulk_strore.repositories.ItemsRepository;

@RestController
@RequestMapping(path = "/items")
public class ItemResource {
	
	@Autowired
	ItemsRepository itemRepository;
	
	@GetMapping
	public List<Item> retrieveAllItems() {
		return itemRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Item retrieveItem(@PathVariable long id) {
		return itemRepository.findById(id).get();
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean deleteItem(@PathVariable long id) {
		try {
			itemRepository.deleteById(id);
		}
		catch (IllegalArgumentException ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}
	
	@PostMapping
	public Item createItem(@RequestBody Item item) {
		Item newItem = null;
		try {
			newItem = itemRepository.save(item);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return newItem;
	}
	
	@PutMapping
	public Item updateItem(@RequestBody Item item) {
		Item resultItem = null;
		try {
			resultItem = itemRepository.save(item);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return resultItem;
	}

}
