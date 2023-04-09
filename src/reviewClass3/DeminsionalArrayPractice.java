package reviewClass3;

public class DeminsionalArrayPractice {
	
	public static void main(String [] args) {
		
		
		int [][] num1= {
				
				{12, 34,35,60,78},
				{10,23,43,25},
				{23,24}
		};
		
		System.out.println("the row numbers "+num1.length);// this will print the row numbers
		System.out.println("first row elements "+num1[0].length); // this print the first row element count
		System.out.println("second row elements "+num1[1].length);
		
		
		// only print 78 and  43
		
		for (int[] num:num1) {
			
			for (int n:num) {
				
				if (n==43 || n==78) {
					
					System.out.println(n);
				}
				
			}
		}
		
		int num3=5;
		int num2=10;
		int sum= num2+num3;// 15
		
	}

}
