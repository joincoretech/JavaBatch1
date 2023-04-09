package class8;

public class BreakInLoop {
	
	public static void main(String[] args) {
		
		// only i need print number 8 and 
		
		for (int i=1; i<=20; i++) {
			System.out.print("this is out side of if block");
			
			if (i==8) {
				System.out.println(i);
				
				break;
			}
		}
		
		
		int num1=1;
		while(num1<=20) {
			System.out.println("this is out side");
			if (num1==2) {
				break;
			}
			num1++;
			
		}
		
		boolean rain= true;
		int temp=74;
		
		while (rain) {
			System.out.println("I will not go out side for walking");
			if (temp>75) {
				System.out.println("I will go out side the weather is warm enought to walk");
				
				break;
			}
			temp++;
			
		}
		
		
	}

}
