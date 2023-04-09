package reviewClass2;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		// lets collect three numbers from a user then create a program to find a
		// larggist number.

		Scanner scanner = new Scanner(System.in);

		
		  System.out.println("Pleas add your first number"); double num1 =
		  scanner.nextDouble(); System.out.println("Please add your second number");
		  double num2 = scanner.nextDouble();
		  System.out.println("Please add your third number"); double num3 =
		 scanner.nextDouble();
		 
		/*
		 * double num1=23; double num2=34; double num3= 40;
		 */

		if (num1 > num2 && num1 > num3 ) {
			System.out.println("The larggist number is  num1 " + num1);

		} else if (num2 > num3 ) {
			System.out.println( "The larggist number is num2 " + num2);
		} else  {
			System.out.println("the larggist number is num3 " + num3);
		}
		
    
	}

}
