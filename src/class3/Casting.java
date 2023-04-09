package class3;

public class Casting {
	
	public static void main(String[] args) {
		  
		
		// casting we add one type variable value to an other type
		
		int num1 =2;
		double num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num1= (int) num2;
		System.out.println(num1);
		
		//Widening Casting(Implicit/ Automatic) - converting lower data type into higher.
		
		int num3 = 10;
		
		float num4 = num3;
		System.out.println(num4);
		
		//Narrowing Casting(Explicit/ Manual) - converting higher data type into lower.
		
		num3 =(int) num4;
		
		System.out.println(num3);
		
		

		
		
		
	}

}
