package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataServices {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		
		int arr[]= {5,18,199};
		return arr;
	}

}
