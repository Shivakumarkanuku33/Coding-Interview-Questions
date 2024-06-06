package com.corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedList {

	public static void main(String[] args) {

		//It is a List of Numbers 
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 2, 5);
		List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 8, 9, 1, 3, 2);
		
		
		//It is used to Merge the two Lists
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());
		System.out.println("Merged List :"+mergedList);
		
		
		// #1 Way
		//It is used to get only Unique Elements
		List<Integer> uniqueList = mergedList.stream()
				.distinct().collect(Collectors.toList());
		System.out.println("Unique List :"+uniqueList);
		
		// #2 Way
		//It is used to get only Unique Elements
		Set<Integer> uniqueSet = mergedList.stream()
				.collect(Collectors.toSet());
		System.out.println("Unique Set :"+uniqueSet);
		
		
		//It is used to get Only Duplicate Elements
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicateList = mergedList.stream().filter(s -> !set.add(s))
		                .collect(Collectors.toList());
		  System.out.println("Duplicate Elements :"+duplicateList);
		
		
	}
}
