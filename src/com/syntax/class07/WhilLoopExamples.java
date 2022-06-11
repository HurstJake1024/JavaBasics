package com.syntax.class07;

public class WhilLoopExamples {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10
		
		int num=10;
				
		while(num<=100) {
			
			System.out.print(num+" ");
			num++;
		}
		
		//print numbers from 10 to 1;
		System.out.println();
		
		int b=10;
		
		while (b>1) {
			System.out.println(b);
			b--;
			
		}
		
		System.out.println();
		
		int c=100;
		
		while (c>=50) {
			System.out.println(c+" ");
			c--;
		}
		
		System.out.println();
		
		int d=-1;
		
		while (d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		
		//print numberes from 1 to 20 but only even numbers
		System.out.println();
		
		int e=0;
		
		while(e<=20) {
			if(e%2==0) {
			System.out.println(e+" ");
			}
			e++;
		}
		
	}

}
