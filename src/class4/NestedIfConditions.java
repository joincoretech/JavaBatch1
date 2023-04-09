package class4;

public class NestedIfConditions {
	
	public static void main(String [] args) {
		
		int age =6;
		
		if (age <18) {
			System.out.println("You should have your father permision to work");
		}else {
			
			System.out.println("you are older than 18");
			if (age<64) {
				System.out.println("you are eligible to work");
			}else {
				System.out.println("enjoy your time. this is your rest time");
			}
			
		}
		
		
		boolean deploma= true;
		double gpa=3.0;
		
		if (deploma) {
			System.out.println("congratulation you have deploma");
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should study hard to be eligible for scholarship");
			}
			
		}else {
			System.out.println("You need to get a degree");
		}
	}

}
