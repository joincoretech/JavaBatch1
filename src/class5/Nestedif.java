package class5;

public class Nestedif {
	
	public static void main(String [] args) {
	
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash.
		 */
		//cnr+shift+/
		
		double rate= 4.8;
		//int mrogage = 20000;
		int price =20000;
		
		if (rate>4.5) {
			System.out.println("Rate is high customer will not buy a house");
			
		}else {
			System.out.println("rate is low enough for customer to by a house");
			if (price>200000) {
				 System.out.println("user will take loan");
				
			}else {
				System.out.println("user have enough cash to  buy a house");
			}
		}
		
		
	}

}
