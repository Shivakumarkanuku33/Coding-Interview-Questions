package com.corejava;

public class SortCharecters {

	public static void main(String[] args) {
		
		String str = "DCBA";
		char[] array = str.toCharArray();
		char temp;
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(new String(array));
}
}
