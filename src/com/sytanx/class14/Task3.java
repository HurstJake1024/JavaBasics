package com.sytanx.class14;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * you have a String a="Is it Saturday? Is it raining? Do we have java class today?"
		 * How ould you find out how manyt senentces are in that String?
		 */
		
		String str="Is it saturday? Is it raining? Do we have a Java Class today? I love java. it is great!";
		System.out.println(str.split("[?.!]").length);
	}

}
