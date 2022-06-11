package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		
		/*
		 * switch can work with byte, short, int, char, String
		 * switch has a datatype limitiations
		 * switch cannotwork with double, float, long, boolean
		 */
		
		double price=10;
		
		/*
		 * switch(price) { //CE: Cannot switch on a value of type double.
		 } 
		 */
		
		/*
		 * switch has a operator limitation
		 */
		
		boolean hungry=true;
		
				switch(hungry) {  -> CE: Cannot switch on a value type boolean
				
				
		char chocies='Y';
		String meaning;
		
		switch(choice) {
		
		case 'Y' || 'y': --> CE: cannot use ||
			meaning"yes";
			break;
			
		int day=5;
		
		switch(day) {
		
		case >5:
			
		}
		}
		
		
		
		}
	}

}
