package class6;

public class SwitchPractice {
	public static void main(String[] args) {

		int day = 2;
		String weekDays = "";

		switch (day) {

		case 1:
			weekDays = "Monday";
			break;
		case 2:
			weekDays = "Tuesday";
			break;
		case 3:
			weekDays = "Wedensday";
			break;
		case 4:
			weekDays = "Thursday";
			break;
		case 5:
			weekDays = "Friday";
			break;
		case 6:
			weekDays = "Saturday";
			break;
		case 7:
			weekDays = "Sunday";
			break;

		default:
			weekDays = "Invalid day";

		}
		System.out.println(day + " = "+weekDays);
		
		
		// write a program to explain the grade A, B,C in the number range
		
		char grade= 'C';
		
		switch (grade) {
		case 'A':
			System.out.println(grade+" = 90-100");
			break;
		case 'B':
			System.out.println(grade+ " = 80-89");
			break;
		case 'C':
			System.out.println(grade+ " = 70-79");
			break;
			
			default:
			System.out.println("Invalid grade input, we only explain A,B,and C");
		}
		
	}

}
