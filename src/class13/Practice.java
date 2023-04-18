package class13;

public class Practice {
	
	public static void main(String[] args) {


//		Create a String and if the String is not
//		empty perform the following: if the String
//		has an odd number of characters and has
//		3 or more characters, print the character in
//		the middle of the String.


		String name1 = "noor";

		if (!name1.isEmpty()) {

			if (name1.length() % 2 == 1 && name1.length() >= 3) {

				int num2 = name1.length() / 2;

				System.out.println("the midddle char of the word is " + name1.charAt(num2));
			} else {

				System.out.println("The string is evevn does not have the middle word");
			}


		} else {

			System.out.println("the password or user  is empty");

		}

	}

}
