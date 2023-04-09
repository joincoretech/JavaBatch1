package reviewClass3;

import java.util.Scanner;

public class ArrayPractice {
	
	
	public static void main(String[] args) {
	
		// create a program to ask the user to size the array and store their text
		
		
		Scanner scanner=new Scanner(System.in);
		
		String[] nameString= new String[2];
		  nameString[0]="Khushal";
		  nameString[1]="Noor";
		  
		
		String [] array;
		
		System.out.println("Please enter the size of elements that you want to store in array by number");
		int size=scanner.nextInt();
		array=new String[size];
		
		for (int i=0; i<size; i++ ) {
			
			System.out.println("Please enter you text ");
			array[i]=scanner.next();
			
		}
		
		for (String str:array) {
			
			System.out.print(str+" ** ");
		}
		
		
		
	}

}
