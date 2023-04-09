package class11;

public class ArrayLength {
	
	public static void main(String[] args) {
		  
		String [] [] countries={  
				{"Afghanistan", "Iraq","Iran", "japan"},
				{"Pakistan","china","German"},
				{"USA", "Canada", "Maxico"}
		};
		
		
		System.out.println("the row numbers:" +countries.length);
		System.out.println("the first row elements: "+countries[0].length);// 
		System.out.println(countries[1].length); // second row elements
		System.out.println(countries[2].length); // the third row elements
		
		
		for (int r=0; r<countries.length; r++) {
			
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+ ", ");
			}
		}
		
		
		System.out.println();
		System.out.println("=====================Use for each loop the get 2D array elements==============");
		
		
		
		for (String[] cot:countries) {
			
		for (String c:cot) {
			System.out.print(c+" ** ");
		}
		}
		
		
		
		
		
				 
	}

}
