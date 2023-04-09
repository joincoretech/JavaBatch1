package class5;

import java.util.Scanner;

public class Practce1 {
	public static void main (String [] args) {
		
		/*
		 * Write a program to determine the classMode. If there is no rain →
		 * classMode=”In Class”, otherwise classMode → “Online”.
		 */
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please tells the weather condition rainy or snowy with value true or false");
		boolean weather= input.nextBoolean();
		
		char grade = input.next().charAt(0);
		
		if (weather) {
			System.out.println("We will have online class today");
		}else {
			System.out.println("We will have in person class");
		}
	}

}
