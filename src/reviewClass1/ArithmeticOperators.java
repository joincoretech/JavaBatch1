package reviewClass1;

public class ArithmeticOperators {
	public static void main(String[] args) {

		// create two variables 99 and 15 then divide the first variable on second and
		// print the reminder

		int number1 = 99;
		int number2 = 15;
		int reminder = number1 % number2;//
		
		
		System.out.println("the rminder is " + number1 % number2);

		// create program to let the user log in create one variable userName an other
		// one password

		String userName = "Arshad";

		String password = "123abc";

		if (userName == "Arshad") {

	 		    System.out.println("your user name is correct add password");

			if (password == "123abc") {

				System.out.println("welcome to your acount");

			} else {
				System.out.println("invalid password try again");
			}

		} else {
			System.out.println("Invalid user name try again");
		}
		
		int num3=25;
		int num4=5;
		int result = num3/num4;
		
		System.out.println(result);//5
		
		
		}
		

	}


