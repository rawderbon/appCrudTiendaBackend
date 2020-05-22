package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
public class ItemController {
	
	@Autowired
    private ItemRepository itemRepository;
	
	 @GetMapping(path = "/items")
	    public List<Item> getItems() {
	    	itemRepository.findAll().forEach(System.out::println);
	        return (List<Item>) itemRepository.findAll();
	    }
	 
		@PostMapping(path = "/items")
		void addItem(@RequestBody List<Item> item) {

			for (Item item2 : item) {

				itemRepository.save(item2);
			}

		}

}
