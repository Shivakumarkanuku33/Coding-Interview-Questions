package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Shiva","Ramu","Shiva","Raju","Raju");

		Map<String, Long> repeatedNames = str.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Repeated Names "+repeatedNames);
}
}