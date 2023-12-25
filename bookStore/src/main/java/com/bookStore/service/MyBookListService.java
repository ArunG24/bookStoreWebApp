package com.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.bookStore.model.MyBookList;
import com.bookStore.repositary.MyBooksRepositary;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBooksRepositary mybook;

	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteBookById(int id) {
		mybook.deleteById(id);;
		
	}
	
}
