package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.pojo.ToDo;
import com.example.demo.service.ToDoServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class ToDoController {
	
	
	@Autowired
	ToDoServices service;
	@Autowired
	LoginController loginController;
	
	  Random random = new Random();
	
	
	
	
	@RequestMapping("todo")
	public String showToDoPage(ModelMap model,HttpServletRequest request)
	{
		String name=;
		
		model.put("todos", service.getTodosbyUser(name));
		return "todo";
	}
	

	@RequestMapping(value="add-todo", method=RequestMethod.GET)
	public String addToDoPage(Model model)
	{
		ToDo temp = new ToDo(0, null, null, null, null);
		
		model.addAttribute("todo", temp);
		
		return "add-todo";
	}
	
	@RequestMapping(value="add-todo", method=RequestMethod.POST)
	public String redirectToDoPage( @Valid @ModelAttribute("todo") ToDo todo , BindingResult result, HttpServletRequest request)
	{
		
		System.out.println("=========================================================");
		if(result.hasErrors())
		{
			
			return "add-todo";
		}

		
		
		int min = 1; // minimum value
        int max = 1000; // maximum value
        int randomInt = random.nextInt(max - min + 1) + min;
		service.Addtodo(randomInt, todo.getTitle(), name, todo.getDueDate(), todo.getPriority());
		
		return "redirect:todo";
	}

	@RequestMapping(value="delete-to-do")
	public String DeleteToDoPage(@RequestParam int id  )
	{
		service.DeleteTodo(id);
		
		return "redirect:todo";
		
		
	}
	
	@RequestMapping(value="update-to-do",method=RequestMethod.GET)
	public String UpdateToDoPage(@RequestParam int id ,Model model )
	{
		ToDo todo =service.findTodoByid(id);
		
		model.addAttribute("todo",todo);
		
		return "add-todo";
		
		
	}
	@RequestMapping(value="update-to-do",method=RequestMethod.POST)
	public String UpdateToDoPagePost(@Valid @ModelAttribute("todo") ToDo todo ,@RequestParam int id ,Model model ,HttpServletRequest request)
	{
		String name=(String) request.getSession(false).getAttribute("name");
		todo.setUser(name);
		service.updateById(id,todo);
		
		return "redirect:todo";
		
		
	}
}
