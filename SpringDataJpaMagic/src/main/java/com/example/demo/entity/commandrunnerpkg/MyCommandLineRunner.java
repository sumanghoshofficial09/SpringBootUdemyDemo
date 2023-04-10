package com.example.demo.entity.commandrunnerpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.MyBook;
import com.example.demo.repository.MyJpaRepositoryInterfacr;

import jakarta.persistence.PersistenceContext;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	MyJpaRepositoryInterfacr repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new MyBook(1, "java", "suman"));
		repository.save(new MyBook(2, "c++", "puja"));
		repository.save(new MyBook(3, "js", "abc"));
		
		/////////////////////////////////////////////
		
		repository.findAll().forEach(System.out::println);
		
		repository.findByAuthor("puja").forEach(System.out::println);
		
	}

}
