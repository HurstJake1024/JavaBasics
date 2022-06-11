package com.sytanx.class14;

public class recap {

	public static void main(String[] args) {
		String str="I never forget about recording";
		System.out.println(str.replace("never", "always").replace("I", "Asghar"));
		
		str="kandjv;ladjkfl;122312123AADJFDSJLJF!@$@#$%^#^";
		System.out.println(str.replaceAll("[0-9]", ""));
		
		String str2="Batch 13 is Great. Batch 13 is Best. batch 13 is excelllent";
		String [] arr=str2.split("[.]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		
		str="WE #love@ Java";
		String[] arr2=str.split("[#]");
		System.out.println(arr[0]);
		System.out.println(arr2[1]);

	}

}
