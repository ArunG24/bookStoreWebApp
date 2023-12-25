package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	MyBookListService mybooks;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		
		mybooks.deleteBookById(id);
		
		return "redirect:/my_books";
	}

}
