package com.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		//FlatMap is used to combine Multiple Lists into Single List
	List<Integer> numbers = Arrays.asList(1,2,3,4);
	List<Integer> oddNumbers = Arrays.asList(3,5,7,9);
	List<Integer> evenNumbers = Arrays.asList(12,14,16,18);

	List<List<Integer>> listOfList = Arrays.asList(numbers,oddNumbers,evenNumbers);

	List<Integer> flattendList = listOfList.stream()
			.flatMap(list -> list.stream())
			.collect(Collectors.toList());

	System.out.println("Flattend List :"+flattendList);
	}
}
