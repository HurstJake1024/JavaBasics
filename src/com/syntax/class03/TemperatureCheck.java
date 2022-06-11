package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		/*
		 * when your code has no errors always try to format it
		 * 
		 * windows ctr+shift+f
		 */

		int temp =67;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("Make sure to use jacket and scarf");

		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
			System.out.println("It is not that cold outside then");
		}
		
		System.out.println("Continuous code");
		System.out.println("I am code outside of if block ");

	}

}
