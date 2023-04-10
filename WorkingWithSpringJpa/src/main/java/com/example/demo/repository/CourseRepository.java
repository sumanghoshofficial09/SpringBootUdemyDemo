package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Courses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CourseRepository {
	
	@PersistenceContext
	EntityManager myentityManager;
	
	
	@Transactional
	public void insert(Courses course)
	{
		myentityManager.merge(course);
		
		
	}
	
	public Courses findCourseById(int id )
	{
		
		return myentityManager.find(Courses.class, id);
		
	}
	
	
	@Transactional
	
	public void deleteById(int id )
	{
		Courses courseToDelete = myentityManager.find(Courses.class, id);
		
		myentityManager.remove(courseToDelete);
	}

}
