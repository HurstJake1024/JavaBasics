package com.syntax.class10;

public class arrayExamples {
	
	public static void main(String[]args) {

	
	String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry"};
			
			int size=disney.length;
	
			System.out.println(size); //4
			
			System.out.println(disney[1]); //Elsa
			
			System.out.println(disney[4]); //RE: ArrayIndexOutOfBoundException
	
	String[] iceCream=new String[3];
	
	iceCream[0]="butter pecan";
	iceCream[1]="chocolate";
	
	System.out.println(iceCream[2]);//null
	
	}
}

