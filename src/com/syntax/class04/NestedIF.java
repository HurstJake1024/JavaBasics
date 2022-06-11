package com.syntax.class04;

public class NestedIF {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;

		if (vaccine) {
			System.out.println("Let me check how many doses you have");

			if (dose == 1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}

		System.out.println("----------------------------");
		
		String month="May";
		int day=19;
		
		if (month.equals("May")) {
			System.out.println("Let me check is today's date");
			
			if (day==8) {
				System.out.println("Today is Mother's Day");
			}
		} else if (month.equals("June")) {
			if (day==19) {
				System.out.println("Today is a Father's Day");
			}
			
			
			
		}

	}

}
