package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Book")
public class MyBook {
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;
	
	
	

	public MyBook() {
		super();
	}

	public MyBook(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "MyBook [id=" + id + ", name=" + name + ", author=" + author + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAuthor()=" + getAuthor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	

}
