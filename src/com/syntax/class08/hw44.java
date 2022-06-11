package com.syntax.class08;
import java.util.Scanner;
public class hw44 {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner (System.in);
	    System.out.println("Please enter your favorite car make");

	    String carMake;
	    String carOrigin=null;
	      carMake=inp.nextLine();

	    switch (carMake) {
	      case "BMW":
	        carOrigin="german car";
	        break;
	      case "Toyota":
	        carOrigin="japanese car";
	        break;
	      case "Maserati":
	        carOrigin="italian car";
	        break;
	      default:
	        {System.out.println("Your favorite car is unkown");}

	      }
		System.out.println("Your favorite car is "+carOrigin);
		
		inp.close();

	}

}
