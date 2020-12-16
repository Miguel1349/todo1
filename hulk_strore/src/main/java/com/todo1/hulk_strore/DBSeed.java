package com.todo1.hulk_strore;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.todo1.hulk_strore.entities.Item;
import com.todo1.hulk_strore.entities.Stock;
import com.todo1.hulk_strore.repositories.ItemsRepository;
import com.todo1.hulk_strore.repositories.StockRepository;

@Component
public class DBSeed implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(DBSeed.class);

	@Autowired
	ItemsRepository itemRepository;
	
	@Autowired
	StockRepository stockRepository;
	
	@Override
	public void run(String... args) throws Exception {
		checkItems();
		checkStock();
	}

	private void checkItems() {
		logger.info("Checking Items...");
		if (itemRepository.count() == 0) {
			itemRepository.save(new Item("Camiseta Spider Man", "Camiseta estapada"));
			itemRepository.save(new Item("Camiseta Batman", "Camiseta estapada"));
			itemRepository.save(new Item("Vaso Thor", "Vaso de Plástico"));
			itemRepository.save(new Item("Vaso Super Man", "Vaso de Plástico"));
			logger.info("Four items created");
		}
	}
	
	public void checkStock() {
		logger.info("Checking Items...");
		if (stockRepository.count() == 0) {
			Item vaso = itemRepository.findById(3L).get();
			Item camiseta = itemRepository.findById(4L).get();
			stockRepository.save(new Stock(new Date(), 4, "Enter four elements", 6, camiseta));
			stockRepository.save(new Stock(new Date(), 3, "Enter three elements", 8, vaso));
			logger.info("Two records created");
		}
		System.out.println("End of Stock");
	}
}