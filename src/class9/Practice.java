package class9;

public class Practice {
	public static void main(String [] args) {
		
		int i, j,num=5;
		for ( i =4; i>=1; i--) {// outer loop will make rows
			
			for ( j=1; j<=i; j++) {
				
				System.out.print(" "+num);
			}
			num--;
			System.out.println();
		}
		
	}

}
