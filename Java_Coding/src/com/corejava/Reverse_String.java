package com.corejava;

public class Reverse_String {

	public static void main(String[] args) {

		String str = "Shiva kumar";

		// Approach---1

		char[] array = str.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		System.out.println("");

		// Approach---2
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");

		// Approach---3

		// StringBuffer buffer = new StringBuffer(str);
		// System.out.println(buffer.reverse());
		// }

		// Approach---4
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder.reverse());

	}
}
