package com.syntax.class03;

public class PrimitiveCasting {

	//ctrl+space--->auto complete
	
	public static void main(String[] args) {
		
		
		int i=100;
		double d=100;
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		long l=1000;
		
		//byte b=130; error: cannot convert from in to byte
		//int x=99.99 erro: cannot convert from double to int
		
		byte b=1;
		
		
		
		//casting in Java-->converting 1 type into another
		
		//widening
		//byte-->short->int->long->float->double
		
		//narrowing
		//double->float->long->int->short->byte
		
		//type mismatch: cannot convert from double to int
		int x=(int)99.99;//narrowing
		System.out.println(x);
		
		//Type mismatch cannot convert from in to byte
		byte m=(byte)130;
		System.out.println(m);
		
		//type mismatch: cannot convert from double to float
		
		float f-10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
		

	}

}
