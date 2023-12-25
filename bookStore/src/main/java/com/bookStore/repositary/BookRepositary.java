package com.bookStore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.model.Book;

   @Repository
	public interface BookRepositary extends JpaRepository<Book,Integer> {
		
}
