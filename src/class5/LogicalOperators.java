package class5;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String [] args) {
		
		
		
		// this out put is for && (and) Operator
		// false , false= salse;
		//false , true = false;
		// true, true == true;
		// true , false = false;
		
		
		// || (Or) Operators
		
		// false , false= flase;
		//flase, true = true
		// true, false = true
		// true , true = true 
		
		/*
		 * WRITE A PROGRAM THAT WILL PRINT WHETHER IT IS A WEEKEND OR WEEKDAY. IF ANY
		 * DAY FROM 1-5 → OUTPUT “IT IS A WEEKDAY”, ANYDAY FROM 6-7 → OUTPUT “IT IS A
		 * WEEKEND”, ANY OTHER DAY → OUTPUT “INVALID DAY”
		 */
		
		int day=8;
		
		if (day>=1 && day<=5) {
			System.out.println("It is weekday");
		}else if(day>=6 && day <=7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid day"); 
		}
		
		/*
		 * Prompt the user to enter person heights in feet. Person should be classiﬁed
		 * as one of the following: short (under 5 feet) medium(5 to 6 feet) tall (6
		 * feet and over)
		 */
		
		Scanner input= new Scanner(System.in);
	   
		System.out.println("Please enter your hight in feet");
		int hight= input.nextInt();
		
		if (hight<5) {
			System.out.println("You are in sort people catogory");
			
		}else if (hight>=5 && hight<=6) {
			System.out.println("You are in medium catagory");
			
		}else {
			System.out.println("you are in tall catagory");
		}

		
	}

}
