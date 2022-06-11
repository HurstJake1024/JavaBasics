package com.syntax.class02;

public class HomeworkJavaClass2 {

	public static void main(String[] args) {
		//#1 
		
		double num1=6.3;
		double num2=3.7;
		
		double sum= num1 + num2;
		double subtract= num1 - num2; 
		double multiply= num1 * num2;
		double divide= num1/ num2;
		
		
		System.out.println("The sum of 2 numbers " + num1 + " and " +num2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + subtract);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + multiply);
		System.out.println("The division of 2 numbers " + num1 + "and" + num2 + "is equal to" + divide);
		
		
		//#2
		
		double aNumber, square;
		aNumber = 3.9;
		square=aNumber*aNumber;
		
		System.out.println("The square of the " + aNumber + " is " + square);
		
		//#3
		int width, height, perimeter, area;
		width = 5;
		height = 8;
		perimeter = (width+height)*2;
		area = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " height " + height + " is equal to " + perimeter + " and the area is " + area);
		
		
		
		

	}

}
