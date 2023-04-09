package class6;

public class NotOperator {
	public static void main (String[] args) {
		
		// not (!) will change the true value to the false
		
		boolean isRain=!true;
		System.out.println(isRain);
		
		boolean good = true;//  true
		
		if (!good) {
			System.out.println("It is not good");// when good is not true
		}else {
			System.out.println("It is good");// true 
		}
	}

}
