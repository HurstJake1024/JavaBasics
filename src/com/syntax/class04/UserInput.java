package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		String str="Hello";
		
		//creating a scanner
		Scanner input=new Scanner(System.in);
		
		//send instructions to the console
		System.out.println("Please enter your name");
		
		//we need to grab the value from console
		String name=input.next();//after you type the value->hit enter
		System.out.println(name);
		
		//let's send instructions
		System.out.println(name+ " please enter your age");
		
		//need to capture and store age
		int age=input.nextInt();
		
		System.out.println(name +" is " + age +" years old");
		
		
				



	}

}
