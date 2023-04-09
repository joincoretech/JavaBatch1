package class7;

import java.util.Scanner;

public class DoWhileVsWhileloop {
	
	
	public static void main(String [] args) {
		
		// lets create a program to let the user add number from 1 -100 when the number get 17 , he win the lottery.
		
		Scanner input= new Scanner(System.in);
		
		int num = 0;
		int lotteryWinNumber=17;
		
		
		
//		do {
//			System.out.println("Please add any number betwean 1-100 to win your lottery");
//			 num=input.nextInt();
//	}while(num!=lotteryWinNumber);
//		
//		System.out.println("congratulation! you are the winner");
		
		while (num!=lotteryWinNumber) {
			System.out.println("Please add any number from 1 - 100 to win your lottery ");
			num=input.nextInt();

		}
		
		System.out.println("Congratulation! you are the winner");

		
	}

}
