package com.syntax.class05;

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			System.out.println("Input the day of the week 1-7");
			
		int num=input.nextInt();
	
				
		if(day==1||day==2||day==3||day==4||day==5) {
			System.out.println("It is a weekday");
		}else if (day==6||day==7 ) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid Day");
		}
		

	}

}
