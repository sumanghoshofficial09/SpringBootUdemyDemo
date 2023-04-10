package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MyBook;


@Repository
public interface MyJpaRepositoryInterfacr extends JpaRepository<MyBook, Integer> {
	
	
	List<MyBook> findByAuthor(String author);

}
