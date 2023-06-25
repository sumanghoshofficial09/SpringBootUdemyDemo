package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.ToDo;

import jakarta.validation.Valid;

@Service
public class ToDoServices {
	
	private static List<ToDo> todos ;
	
	

	public static void setTodos(List<ToDo> todos) {
		ToDoServices.todos = todos;
	}



	public static List<ToDo> getTodosbyUser(String user) {
		
		List<ToDo> resultantTodos ;
		if(todos!=null)
		{
		resultantTodos=todos.stream().filter(todo -> todo.getUser().equalsIgnoreCase(user)).collect(Collectors.toList());
		}
		else
		{
			resultantTodos = todos = new ArrayList<ToDo>();
		}
		return resultantTodos;
	}
	
	public void Addtodo(int id, String title, String user, LocalDate dueDate, String priority)
	{
		
		List<ToDo> todos = this.getTodosbyUser(user);
		ToDo temp = new ToDo(id, title, user, dueDate, priority);
		todos.add(temp);
		this.setTodos(todos);
		
	}



	public void DeleteTodo(int id) {
		
		Predicate<? super ToDo> removeById = todo ->  todo.getId()== id ;
		todos.removeIf(removeById);
		
	}



	public ToDo findTodoByid(int id) {
		
		Predicate<? super ToDo> findById = todo ->  todo.getId()== id ;
		
		
		ToDo todo=todos.stream().filter(findById).findFirst().get();
		
		return todo;
		
		
	}



	public void updateById(int id, @Valid ToDo todo2) {


			ToDo todo=this.findTodoByid(id);
			
			todos.remove(todo);
			todos.add(todo2);
			
			
		
	}
	

}
