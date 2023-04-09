package class9;


public class NestedLoops {
	public static void main(String[] args) {
		
		for (int r=1; r<=3; r++) {// outer loop
		
			System.out.println();
			for(int c=1; c<=3; c++) {// inner loop.  after c value get higher than 3 inner loop will stop
				
				System.out.print(c+" ");
			}
		}
		
		for (int i=1; i<3; i++) {
			System.out.println();
			System.out.print("I am outer loop");
			
			for (int j=1; j<=2; j++) {
				System.out.println();
				System.out.print("I am inner loop");
			}
			
		}
		
		System.out.println();
		
		for (int i=1; i<=5; i++) {//outer loop
			
			for(int j=1; j<=i; j++) {// inner loop
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
			
		for (int i=5; i>=1; i--) {//outer loop
			
			for(int j=1; j<=i; j++) {// inner loop
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}

}
