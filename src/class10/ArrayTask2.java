package class10;

public class ArrayTask2 {
	
	public static void main (String [] args) {
		
		int []  numbers= {12,23,34,45,56, 34,50};// size of array 7
		 //                0 1   2  3  4   5  6  indexes
		
		System.out.println(numbers[4]);
		System.out.println("The size of array is "+numbers.length);
		
		for (int i=0; i<numbers.length; i++) {
			
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		for (int i=numbers.length-1; i>=0; i--) {
			
			System.out.print(numbers[i]+ " ");
		}
		 
	   System.out.println();
		System.out.println(numbers[4]+" "+numbers[3]+ " "+ numbers[0]);
		
		
		
	}

}
