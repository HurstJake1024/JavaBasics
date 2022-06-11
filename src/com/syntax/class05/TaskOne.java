package com.syntax.class05;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter age");
		int age=scan.nextInt();
		System.out.println(age);
		if (age >= 18) {
			System.out.println("Your driver's license will be issued.");
		} else {
			System.out.println("You are not old enough to obtain a dirver's licence, "
					+"would you like a learners permit?");
			
		}
		
		
	
	}

}
