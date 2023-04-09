package class2;

public class VariablePractice {
	public static void main(String [] args) {
		
		// Declare a variable then assign a value 12.
		int n1;
		n1 = 12;
		
		// we can create couple variable in the same time.
		int num1, num2, num3;
		num1 = 5;
		num2 = 10;
		num3 = num2;
		// we can change the value of the variable
		num1 = 15;
		System.out.println(num1);
		
		boolean isTodayFriday;
		isTodayFriday = false;
		boolean isTodaySunday;
		isTodaySunday = isTodayFriday;
		
	    boolean isTodayMonday = true;
	    
	    String name = "Farhad";
	    
	    String greating = "Hello my name is ";
	    
	    System.out.println(greating + name);
	    System.out.print("is today friday: " + isTodayFriday); // 
	    System.out.println( isTodayFriday); // false
	    
		/*
		 * // To attach any value (int, String, char, boolean ) to a String we use (+)->
		 * concatenation operator
		 * 
		 * Operators in Java: Assignment Operator: =
		 *  Arithmetic Operators: +, -, /, *, %
		 */
	     
	    // create a String variable shopping and assign the value " I want to buy:"
	     // declare int num and assign the value 10.
	    // Create variable String count assign the value "apples"
	    // concatenate all three variables make a correct sentences. 
	    
	    String shopping = "I want to buy:";
	    int num = 10;
	    String count = " apples";
	    System.out.println(shopping + num + count);
	    
	    
	    
	    
	    
	 
		
	}

}
