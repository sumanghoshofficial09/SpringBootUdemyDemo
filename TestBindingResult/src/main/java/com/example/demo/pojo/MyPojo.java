package com.example.demo.pojo;

import jakarta.validation.constraints.NotNull;


public class MyPojo {
	
	
	@NotNull
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyPojo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyPojo [name=" + name + "]";
	}
	
	

}
