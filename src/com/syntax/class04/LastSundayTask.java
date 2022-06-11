package com.syntax.class04;

public class LastSundayTask {

	public static void main(String[] args) {
		
		boolean gotDiploma=true;
		double GPA=2;
		
			if (gotDiploma) {
				System.out.println("What is yoru GPA?");
				GPA=3.6;
				
				if (GPA>3.5) {
					System.out.println("You are eligive for scholarship");
				}else if (GPA<3.5) {
					System.out.println("You should have studied harder");
				}
				
			}
		
	}

}
