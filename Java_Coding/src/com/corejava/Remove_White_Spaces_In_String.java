package com.corejava;

public class Remove_White_Spaces_In_String {

	public static void main(String[] args) {
		
		String str = "  H   E   LL   O   J   A  V    A   ";
		
		//It is helps to remove the spaces in String
		String str1 = str.replaceAll("\\s","");
		System.out.println(str1);
		
	}
}
