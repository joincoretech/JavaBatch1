package class9;


public class ContinueKeyWord {
	public static void main(String[] args) {
		
		
		//print the numbers from 1-5 except 2 and 4
		
		for (int i=1; i<=5; i++) {
			
			if (i==2 || i==4) {
				
				continue;
			}
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("========== we can print the numbers from 1-40 except those numbers are divisible by 4");
		
		for (int a=1; a<=40; a++) {
			
			if(a%4==0) {
				continue;
			}
			
			
			System.out.print(a+" ");
		}
		
		
		
	}

}
