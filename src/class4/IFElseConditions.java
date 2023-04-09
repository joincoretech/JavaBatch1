package class4;

public class IFElseConditions {
	public static void main(String[] Nael) {

		double num1 = 15.12;
		double num2 = 15.12;

		if (num1 > num2) {

			System.out.println("Double value " + num1 + " is bigger than " + num2);

		} else if (num1 < num2) {

			System.out.println("Double value " + num2 + " is bigger than " + num1);
		} else {

			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("================================");
		// if we need more conditions , we add " else if"
		// write the week days in if condition

		int day = 0;

		if (day == 1) {
			System.out.println("To day is Monday");
		} else if (day == 2) {
			System.out.println("To day is Tuesday");
		} else if (day == 3) {
			System.out.println("To day is Wedensday");
		} else if (day == 4) {
			System.out.println("To day is thursday");
		} else if (day == 5) {
			System.out.println("To day is friday");
		} else if (day == 6) {
			System.out.println("To day is sunday");
		} else if (day == 7) {
			System.out.println("To day is saturday");
		} else {
			System.out.println("The day is invalid");
		}

		int a = 2;
		System.out.println(a == 2);//

		boolean isRain = true;

		if (isRain) {
			System.out.println("I will saty home out side is rainy");
		} else {
			System.out.println("the weather is not rainy lets go out");
		}
	}

}
