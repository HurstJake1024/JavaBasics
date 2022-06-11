package com.syntax.class08;

public class Task1 {

}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner inp=new Scanner (System.in);
    System.out.println("Please enter your favorite car make");

    String carMake=inp.nextLine();

    switch (carMake) {
      case "BMW":
        System.out.println("Your favorite car is german car");
        break;
      case "Toyota":
        System.out.println("Your favorite car is japanese car");
        break;
      case "Maserati":
        System.out.println("Your favorite car is italian car");
        break;
      default:
        System.out.println("Your favorite car is unkown");

      }
        
    }

}