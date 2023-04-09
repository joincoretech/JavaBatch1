package class8;

public class ForLoop {
	public static void main (String[] args) {
		
		// i want to say 3 times Hello to Muzamel
		
//		System.out.println("Hello Muzamel");
//		System.out.println("Hello Muzamel");
//		System.out.println("Hello Muzamel");
		
		for(int i=1; i<=3; i++ ) {
			
			System.out.print("Hello Muzamel, ");
		}
		
		System.out.println("=========================================");
		
		// print the number from 1 - 50 in one line
		
		for (int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("===============print number from 10 - 1 in one line");
		
		for (int i=10;  i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("=============print number from 1 - 20 increment by 2");
		
		for (int i=1; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
