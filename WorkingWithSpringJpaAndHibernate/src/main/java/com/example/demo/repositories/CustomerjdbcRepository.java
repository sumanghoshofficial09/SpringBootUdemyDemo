package com.example.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entitirs.Customer;


@Repository
public class CustomerjdbcRepository {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String INSERT_QUERY="""
			
			insert into customer (name , id) values(?,?)
			""";
	
private static String DELETE_QUERY="""
			
			delete  from  customer  where id = ?
			""";

private static String SELECT_QUERY="""

 select *   from  customer  where id = ?
""";
	
	public void insert(Customer customer)
	{
		jdbcTemplate.update(INSERT_QUERY,customer.getName(),customer.getId());
	}
	
	
	public void delete(long id)
	{
		jdbcTemplate.update(DELETE_QUERY,id);
	}

	
	public Customer select(long id)
	{
		return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Customer.class),id);
	}

}
