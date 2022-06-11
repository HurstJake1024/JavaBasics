package com.syntax.class08;
import java.util.Scanner;
public class HW39 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter you mark");

		int mark1=inp.nextInt();
		String grade = null;

		if (mark1>=80 && mark1<=100) {
		  grade="A";
		}else if (mark1>60 && mark1<=80) {
		  grade="B";
	    }else if (mark1>50 && mark1<=60) {
	      grade="C";
	    }else if (mark1>45 && mark1<=50) {
	      grade="D";
	    }else if (mark1>25 && mark1<=45) {
	      grade="E";
	    }else if (mark1>=1 && mark1<=25) {
	      grade="F";
		}else {
			System.out.println("Please enter valid mark");
		}
		 
		System.out.println("Your grade is "+ grade);
		inp.close();
	}
	}



