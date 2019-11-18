package com.learning.SpringWeb;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	Logger log = Logger.getLogger(BookController.class.getName());
	@GetMapping("/books")
	public List<Book> bookDetails() {
		log.setLevel(Level.INFO);
		log.info("Hi I am in BookController");
		return Arrays.asList(new Book(1l,"Good Man","Jayanta"));
		
	}

}
