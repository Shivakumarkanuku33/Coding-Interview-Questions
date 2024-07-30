package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

  List<Character> list = Arrays.asList('A','B','C','D','B','D','A');

    Set<Character> set = new HashSet<>();
   List<Character> uniqueCharecters = list.stream()
		   .filter(k -> !set.add(k)).collect(Collectors.toList());
    System.out.println("Unique Charecters "+uniqueCharecters);
	}
}
