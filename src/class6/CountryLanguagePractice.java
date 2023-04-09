package class6;

import java.util.Scanner;

public class CountryLanguagePractice {
	public static void main (String[] args) {
		
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please add your country name first letter should be copital to show you the language");
		String countryName = scan.nextLine();
		
		switch (countryName) {
		
		case "United State":
			System.out.println("English");
			break;
		case "Afghanistan":
			System.out.println("Pashto/Dari");
			break;
		case "Iraq":
			System.out.println("Arbic");
			break;
			default:
			System.out.println("Sorry! the country is not in our list");
			
		}
		
		
	}

}
