package com.example.demo.pojo;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ToDo {
	
	@NotNull
	private int id;
	@NotNull
	private String title;

	private String user;
	@NotNull
	private LocalDate dueDate;
	@NotNull
	@Size(min=1,max=10)
	private String priority;

	public ToDo(int id, String title, String user, LocalDate dueDate, String priority) {
		super();
		this.id = id;
		this.title = title;
		this.user = user;
		this.dueDate = dueDate;
		this.priority = priority;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", title=" + title + ", user=" + user + ", dueDate=" + dueDate + ", priority="
				+ priority + "]";
	}
	
	

}
