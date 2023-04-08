package com.example.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataservice implements DataServices {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		
		int arr[]= {3,8,99};
		return arr;
	}

}
