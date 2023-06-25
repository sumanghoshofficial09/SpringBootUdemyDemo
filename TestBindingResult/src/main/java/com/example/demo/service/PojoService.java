package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.MyPojo;

@Service
public class PojoService {
	
	private static List<MyPojo> pojolist;
	
	static
	{
		if(pojolist==null)
		{
			pojolist = new ArrayList<>();
			
			pojolist.add(new MyPojo("suman"));
		}
	}

	public static List<MyPojo> getPojolist() {
		return pojolist;
	}

}
