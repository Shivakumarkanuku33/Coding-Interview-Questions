package com.corejava;

public class Remove_Special_Charecters_In_String {

	public static void main(String[] args) {
		
		String str = "H!@@$%E++*&L**L++#$O%*&*&%$J@@A%&V**A##";
		
		//we are printing what characters we want
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
		
	}
}
