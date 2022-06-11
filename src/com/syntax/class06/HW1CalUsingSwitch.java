package com.syntax.class06;
import java.util.Scanner;
public class HW1CalUsingSwitch {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Please enter the numbers");
		double x = inp.nextDouble();
		double y = inp.nextDouble();
		System.out.println("Please enter the operators + , - , * , / ");
		char opp = inp.next().charAt(0);
		double result = 0;
		String operator=null;
		switch (opp) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '/':
			result = x / y;
			break;
		case '*':
			result=x*y;
			break;
		default:
			System.out.println("Invalid Operator");
			operator="Invalid";
		}
		
		if (result!=0 || operator==null) {
			System.out.println(result);
		}
		
		
		
	System.out.println(result);
	
	inp.close();
	}

}
