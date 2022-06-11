package com.syntax.class06;

import java.util.Scanner;

public class ReplitHW36 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1 = inp.nextLine();
		String word2 = inp.nextLine();

		System.out.println("Please enter two numbers");
		int int1 = inp.nextInt();
		int int2 = inp.nextInt();
	  
		if (int1==int2 && word1.equals(word2)) {
		System.out.println("AND");
		}else if (int1==int2 || word1.equals(word2)) {
			System.out.println("OR");
		}else if (int1!=int2 && !word1.equals(word2)) {	
			System.out.println("NONE");
		
		
	     }
	  }

}
