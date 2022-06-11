package com.syntax.class08;
import java.util.Scanner;
public class hw45 {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner (System.in);
		    System.out.println("Input a number between 1-7");

		    int day=scan.nextInt();
		    String dayOfWeek=null;  
		      
		      

		      switch (day) {
		        case 1:
		        dayOfWeek="Monday";
		        break;
		        
		        case 2:
		        dayOfWeek="Tuesday";
		        break;
		        
		        case 3:
		        dayOfWeek="Wednesday";
		        break;
		        
		        case 4:
		        dayOfWeek="Thursday";
		        break;
		        
		        case 5:
		        dayOfWeek="Friday";
		        break;  
		        
		        case 6:
		        dayOfWeek="Saturday";
		        break;  
		        
		        case 7:
		        dayOfWeek="Sunday";
		        break;  
		        
		        default:
		          dayOfWeek="Invalid";
		          
		      }
		    System.out.println(dayOfWeek);
		  }
		  
		}

	