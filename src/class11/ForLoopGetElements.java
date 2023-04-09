package class11;

public class ForLoopGetElements {
	
	public static void main(String[] args) {
		
		
		int [][] numbers= {
				{12,10,23,24,56},
				{10,5,6},
				{55,56,58,59}
		};
		 
		System.out.println(numbers.length);// the row numbers//3
		System.out.println(numbers[2].length);// the number of third row elements//4
		
		
		for (int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				if (numbers[r][c]%2==0) {
					
					System.out.print(numbers[r][c]+" ## ");
				}
			}
		}
		
		System.out.println();
		System.out.println("==============useing for each loop================="); 
		
		
		
		for (int [] num1:numbers) {
			
			for(int n:num1) {
				if (n%2!=0) {
					System.out.print(n+ " && ");
				}
			}
		
		}
		
		System.out.println();
		System.out.println("=====================sum of the array==============");
		int sum=0;
		for(int [] num: numbers) {
			
			for (int n:num) {
				sum+=n;
			}
		}
		System.out.println("sum of the elements "+sum);
		
	}

}
