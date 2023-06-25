package com.example.demo.controller;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.pojo.MyPojo;
import com.example.demo.service.PojoService;

import jakarta.validation.Valid;

@Controller
public class PojoController {
	
	
	@Autowired
	PojoService  service;
	
	
	@RequestMapping(value="pojo",method=RequestMethod.GET)
	public String handlePojo(Model model)
	{
		model.addAttribute("mypojo", new MyPojo("default"));
		return "mypojo";
	}
	
	@RequestMapping(value="pojo",method=RequestMethod.POST)
	public String handlePojoPost(@Valid  @ModelAttribute("mypojo")   MyPojo newpojo,BindingResult result,ModelMap model)
	{
	
		if(result.hasErrors())
			return "mypojo";
		
		
		service.getPojolist().add(newpojo);
		
		model.addAttribute("msg", "added");
		return "mypojo";
	}
	
	
	
	@RequestMapping("listpojo")
	public String listPojo(ModelMap model)
	{
		model.addAttribute("pojos", service.getPojolist());
		return "listpojo";
	}
	
	
	

}
