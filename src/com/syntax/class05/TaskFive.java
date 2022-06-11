package com.syntax.class05;

import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number from 0 to 1000");
		
		int num=input.nextInt();
		
		if(num>=1&&num<=10 ) {
			System.out.println("The number is small");
		} else if(num>10&&num<=100) {
			System.out.println("The number is medium");
		} else if(num>100&&num<=1000) {
			System.out.println("The number is large");
			
		}

	}

}
