package com.sytanx.class14;

public class SpringBuilderDemo {

	public static void main(String[] args) {

		String s=new String("hahahahha");
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jaajajajaj");
		System.out.println(st.reverse());
		//String and StringBuilder both are classes that we can use to store and manipulate characters
		//But String is immutable (cannot be changed) and StringBuilder is mutable (can be changed)
		//when we make a lot of changes to a to a String it creates multiple copes inside your memory and
		//because of this reason because for every change a new variable is created
	}

}
