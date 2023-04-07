package com.example.demo.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class QuickSort implements Sorting {

	@Override
	public void sort() {
		System.out.println("Quick Sort");

	}

}
