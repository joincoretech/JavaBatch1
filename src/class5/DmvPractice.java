package class5;


import java.util.Scanner;

public class DmvPractice {
	public static void main(String [] args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please add you age");
		
		int age= input.nextInt();
		
        if (age>=18) {
        	System.out.println("Cogratulation! you are eligible for license");
        }else {
        	System.out.println("Sorry! you are not eligible for license but you can have permit");
        }
		
		
		
	}

}
