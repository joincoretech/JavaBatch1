package reviewClass2;

import java.util.Scanner;

public class task1 {
	
	public static void main (String[] args) {
		
		// ask a user. do you have credit card or not? if hasCredit= true then say good job keep your credit up" 
		//if does not has credit card. ask the costumer to get one
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please tell use, do you have credit card anserw by true, or false ");
		
		boolean creditCard=input.nextBoolean();
		
		if(creditCard) {
			System.out.println("Good job keep your credit up");
		}else {
		 System.out.println("Please except or offer we have very good options to get one credit card");	
		}
		
	}

}
