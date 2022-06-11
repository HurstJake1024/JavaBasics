package com.sytanx.class14;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create a String that should be a combination
		 * of letters, numbers and special characters. Find out how many Alphnumeric
		 * characters are the in the string
		 */
		
		String str="asfdsasdf234134241!@#$$#%2";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
	}
}
