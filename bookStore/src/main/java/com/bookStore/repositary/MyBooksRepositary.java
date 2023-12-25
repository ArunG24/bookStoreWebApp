package com.bookStore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bookStore.model.MyBookList;

@Repository
public interface  MyBooksRepositary extends JpaRepository<MyBookList,Integer> {


}
