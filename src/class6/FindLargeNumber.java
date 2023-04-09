package class6;

import java.util.Scanner;

public class FindLargeNumber {
	public static void main (String [] args) {
		
		/*
		 * Write a program to ﬁnd largest of three double values using if-else.. if and
		 * logical operators provided by a user (numbers must be distinct)
		 */
		
		double num1 = 16.5;
		double num2 = 15.34;
		double num3 = 25.25;
		
		if (num1>num2 && num2>num3) {
			System.out.println("the largist number is "+num1);
			
		}else if(num2>num3) {
			System.out.println("The largist number is "+num2);
		}else {
			System.out.println("The largist number is "+ num3);
		}
		
		System.out.println("==================================");
		// customerInput
		
		//Program to ﬁnd largest number among three numbers using nested if provided by a user (numbers must be distinct)
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please add three differnt number to find the largist");
		int number1= input.nextInt();
		System.out.println("Please add number 2");
		int number2= input.nextInt();
		System.out.println("Please add number 3");
		int number3= input.nextInt();
		
		if (number1>number2) {
			if(number2>number3) {
				System.out.println("The largist number is "+number1);
			}
		}else if(number2 > number3) {
			System.out.println("The ragist number is "+number2);
		}else {
			System.out.println("The largist number is "+number3);
		}
		
	}

}
