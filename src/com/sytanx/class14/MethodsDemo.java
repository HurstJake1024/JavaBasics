package com.sytanx.class14;
import java.util.Scanner;
public class MethodsDemo {
	//Method is a block of code a group of Java statements that are grouped together
	//we can execute those statements by just creating an object of the class that contains
	//that method and by writing the objects name .method name
	void printHello() {
		System.out.println("How are you guys");
		} 
	boolean returnTrue() {
		return true;
	}
	
	int returnInt() {
		return 10;
	}
	//Methods that return something and Methods that don't return something
	public static void main(String[] args) {
		MethodsDemo md=new MethodsDemo();
		md.printHello();
		
		boolean xs=md.returnTrue();
		int num=md.returnInt();
		System.out.println(num);
		System.out.println(num=md.returnInt());
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
				
		
	}

}
