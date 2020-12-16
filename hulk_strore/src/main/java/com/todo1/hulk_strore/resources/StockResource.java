package com.todo1.hulk_strore.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo1.hulk_strore.entities.Stock;
import com.todo1.hulk_strore.repositories.StockRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(path = "/stock")
public class StockResource {
	
	@Autowired
	StockRepository stockRepository;
	
	@GetMapping
	public List<Stock> retrieveStock() {
		return stockRepository.findAll();
	}
	
	@PostMapping
	public Stock addMerchandise(@RequestBody Stock stock) {
		Stock in = null;
		try {
			in = stockRepository.saveAndFlush(stock);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return in;
	}
	
	@PutMapping
	public Stock updateStock(@RequestBody Stock stock) {
		Stock stockUpdated = null;
		try {;
			stockUpdated = stockRepository.save(stock);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return stockUpdated;
	}
}
