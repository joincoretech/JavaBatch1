package class6;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Pleade add your Grade in upper case letter");
		char grade = input.next().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Not good enough");
			break;
		default:
			System.out.println("Not Acceptable");
		}

	}

}
