package class11;

public class Practice2 {
	public static void main(String[] args) {
		
		int [] num= {12,10,15,16,18};
		 int sum=0;
		 
		for (int n:num) {
			 sum=sum+n;		
		}
	
		System.out.println("Array elements sum : "+sum);
		
		
		
		
		
		int large=num[0];
		
		for (int i=0; i<num.length; i++) {
			
			if (num[i]>large) {
				
				large=num[i];
				
			}
		}
		System.out.println("The array largist number is : "+ large);
		
	}

}
