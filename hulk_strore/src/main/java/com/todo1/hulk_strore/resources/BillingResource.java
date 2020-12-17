package com.todo1.hulk_strore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo1.hulk_strore.repositories.SoldDetailRepository;
import com.todo1.hulk_strore.repositories.SoldHeaderRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(path = "/billing")
public class BillingResource {
	
	@Autowired
	SoldHeaderRepository soldHeaderRepository;
	
	@Autowired
	SoldDetailRepository soldDetailRepository;
	

}
