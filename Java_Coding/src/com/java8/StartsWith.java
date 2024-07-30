package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	public static void main(String[] args) {

		String str = "Welcome to Java";

		List<String> list = new ArrayList<>();
		list.add("Shiva");
		list.add("Somesh");
		list.add("Sushil");
		list.add("Ajay");
		list.add("Veeresh");

		List<String> collectedList = list.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.err.println( str + collectedList);

	}
}
