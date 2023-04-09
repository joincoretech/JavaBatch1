package class5;

import java.util.Scanner;

public class Practice {
	public static void main(String [] args) {
		
		/*
		 * 1. Write a program that will read three inputs of scores (quiz, mid term, and
		 * ﬁnal scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
		
		Scanner inputScanner= new Scanner(System.in);
		
		System.out.println("Please add your quiz score");
		int quiz=inputScanner.nextInt();// if student add 90, what will be the quiz value : 90
		System.out.println("Please add you med term score");
		int med=inputScanner.nextInt();// if student add 95, what will be the quiz value : 95
		System.out.println("Please add your final score");
		int finalScore=inputScanner.nextInt();// if student add 90, what will be the quiz value : 90
		
		int avg= (quiz+med+finalScore)/3;
		
		if (avg>=90)// avg higher or equal than 90 
			{
			System.out.println("A");
			
		}else if(avg>=70 && avg<90 )// avg should be between 70-89 
			{
			
			System.out.println("B");
		}else if (avg>=50 && avg<70)// avd is 50-69 
			{
			
			System.out.println("C");
		}else {
			System.out.println("F");// lower than 50;
		}
		
		
	}

}
