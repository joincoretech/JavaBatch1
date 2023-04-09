package reviewClass2;

public class LoopsPractice {
	public static void main (String [] args) {
		
		int num1=1;
		
		while(num1>1) {// while loop check the condition first then run
		  
			System.out.println("i am while loop")	;
		  num1--;
		}
		
		
		do {  // do while loop run first then check the condition
			
			System.out.println("I am do while loop");
			num1--;
		}while(num1>1);
		
		
		long num4=1000;
		
		int num5 = (int) num4;
		
		double num3=num4;
		
		System.out.println(num3);
		
		
	}

}
