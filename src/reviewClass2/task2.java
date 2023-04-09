package reviewClass2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
		
		// let collect the first and last name from a costumer.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please type your first name");
		String firstName=scanner.nextLine();
		
		System.out.println("Please type your last name");
		String lastName= scanner.next();
		
		System.out.println("Hello! your first name is "+firstName+" and your last name is "+lastName);
	}

}
