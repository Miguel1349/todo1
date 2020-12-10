package com.todo1.hulk_strore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.todo1.hulk_strore.entities.Item;
import com.todo1.hulk_strore.repositories.ItemsRepository;

@Component
public class DBSeed implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(DBSeed.class);

	@Autowired
	ItemsRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		checkItems();
	}

	private void checkItems() {
		logger.info("Checking Items...");
		if (itemRepository.count() == 0) {
			itemRepository.save(new Item("Camiseta Spider Man", "Camiseta estapada"));
			itemRepository.save(new Item("Camiseta Batman", "Camiseta estapada"));
			itemRepository.save(new Item("Vaso Thor", "Vaso de Plástico"));
			itemRepository.save(new Item("Vaso Thor", "Vaso de Plástico"));
			logger.info("Four items created");
		}
	}
}
