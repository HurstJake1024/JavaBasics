package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Jake";
		String lastName="Hurst";
		int grade=12;
		char letterGrade='A';
		String city="Los Angeles";
		String state="California";
		long phoneNumber=1234567890l;
		String age="30";
		
		System.out.println("My name is"+" "+name+" "+"and my last name is"+" "+lastName);

		System.out.println("I am an"+" "+letterGrade+" "+"student.");
		
		System.out.println("I live in"+" "+city+" "+"and the state of"+" "+state+".");
		
		System.out.println("And my phone number is"+" "+phoneNumber+".");
		
		city="Orlando";
		state="Florida";
		phoneNumber=6483841236l;
		letterGrade='B';
		grade=11;
		
		System.out.println(city);
		
		System.out.println(phoneNumber);
		
		String words="years old";
		System.out.println(name+" is "+age+" "+words);
		
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2. no key words
		 * 3 cannon star with numbers (numbers can be sued after the 
		 * 4. cannot have special character (except _, $)
		 
		 */
		
		//String break="Hello"; error
		//int 1number=10; error
		int number1=10;
		
		//int number%=20;error
		double $price=3.99;
		float f_=2.99f;
		
		/*
		 * Naming Conventions
		 * follow camel casing
		 * variable/methods names should start with lowercase and then follow camel casing
		 * class names should start with uppercase 
		 */
		
		String mycity="Orlando";
		
		
				
				
				
		
		

	}

}
