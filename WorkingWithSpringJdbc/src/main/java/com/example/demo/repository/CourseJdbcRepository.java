package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.MyCourse;

@Repository
public class CourseJdbcRepository {
	
	String insert_query="INSERT INTO mycourse (id, name, author) VALUES (?, ?, ?) ";
	
	String delete_query_id="Delete from mycourse where id=?";
	
	String delete_query_name="Delete from mycourse where name = ?";
	
	

	
	@Autowired
	JdbcTemplate myJdbcTemplate;
	
	public void insertQuery(MyCourse mycourse)
	{
		
		myJdbcTemplate.update(insert_query,mycourse.getId(),mycourse.getName(),mycourse.getAuthor());
	}
	
	
	public void deleteQueryByID(int id)
	{
		myJdbcTemplate.update(delete_query_id,id);
	}
	
	public void deleteQueryByName(String name)
	{
		myJdbcTemplate.update(delete_query_name,name);
	}
	

}
