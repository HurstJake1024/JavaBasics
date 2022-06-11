package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Jake";
		
		String lastName="Hurst";
		
		long phone=1234567890l;
		
		//xxx - xxx - xxxx
		
		String phoneNumber="123-456-7890";
		
		String address="123 Washington str";
		
		int age=30;
		String city="Miami";
		
		
		//shorcut for printing
		// syso +ctrl +space --> enter
		
		/*
		 * we can use + --> work as concatenation operator
		 * 		to attach String to String
		 * 		to attach String to int
		 * 		to attach String to double
		 * 		to any other type
		 */
		 
		System.out.println(name+" "+lastName);//Jake Hurst
		
		//Jake lives in Miami
		
		System.out.println(name+" lives in "+ city);
		
		//Jake is 30 years old
		
	System.out.println(name+" is"+" "+age+" "+"years old.");

	}

}
