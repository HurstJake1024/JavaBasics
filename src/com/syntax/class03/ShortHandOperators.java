package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		
		num=num+50;
		
		System.out.println(num);
		
		num+=100; ///num=num+100
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;
		System.out.println(a);//30
		
		a+=b+c;// a=a+b+c
		System.out.println(a);//80
		
		int z=100;
		
		z+=z+500;
		
		System.out.println(z);
		
		
		
		

	}

}
