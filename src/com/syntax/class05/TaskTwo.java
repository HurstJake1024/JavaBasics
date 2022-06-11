package com.syntax.class05;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean boo = true;
		
		System.out.println("Do you have a credit card?");
		boo= input.nextBoolean();
		if (boo==true) {
				System.out.println("What is the balance on your card?" );
				int balance;
				balance=input.nextInt();
				if(balance>1000) {
					System.out.println("Please pay it off immediately");
				    }else { 
					   System.out.println("You may spend more.");
				    }
		}else {
			System.out.println("Would you like a credit card?");
			}
			
			
			

	}

}
