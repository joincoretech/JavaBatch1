package class3;

public class ArithmaticOperators {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		// +, -, /, *, %

		System.out.println(num1 + num2);// output 15
		System.out.println(num1 - num2);// 5
		System.out.println(num1 / num2);// 2
		System.out.println(num1 * num2);// 50
		System.out.println(num1 % num2);// 0

		// we sue variables to initialize an other variable
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println(sum);
		System.out.println(sub);

		System.out.println("Sum of number " + num1 + " and " + num2 + " is = " + sum);

		double number1 = 10.15;
		double number2 = 100.34;

		double sumOfTwoNum = number1 + number2;

		int result = 2 + 4 * 3; // 14
		System.out.println(result);

		int mod1 = 10 % 3; // 1
		System.out.println(mod1);

		int result2 = (20 % 7) * 3;
		System.out.println(result2);

	}

}
