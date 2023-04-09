package class7;

import java.util.Scanner;

public class Practice {
	public static void main(String [] args) {
		
		/*
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		
		Scanner  input= new Scanner(System.in);
		
       System.out.println("Please add a number");
       double number1= input.nextDouble();
       System.out.println("Please add secode number");
       double number2= input.nextDouble();
       System.out.println("Please add one of these operators +, -, /, *");
       char operator= input.next().charAt(0);
       
       switch (operator) {
       
       case '+':
    	   System.out.println(number1+ " + "+number2+" = "+number1+number2);
    	   break;
       case '-':
    	   System.out.println(number1+ " + "+number2+" = " +(number1-number2));
    	   break;
       case '/':
    	   System.out.println(number1/number2);
           break;
       case '*':
    	   System.out.println(number1*number2);
    	   break;
    	   default:
    		   System.out.println("Sorry! OurWork program does not know this operation");
    	   
       }
       
       // we can use == for numbers
       // equal for string
       String a= "hello";
       String b= "Hello";
       
       if (a.equals(a)) {
    	   System.out.println("these variables are same");
       }else {
    	   System.out.println("they are not same");
       }
	}

}
