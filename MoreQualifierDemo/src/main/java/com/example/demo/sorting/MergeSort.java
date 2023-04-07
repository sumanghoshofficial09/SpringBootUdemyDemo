package com.example.demo.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class MergeSort implements Sorting {

	@Override
	public void sort() {

		System.out.println("merge sort");

	}

}
