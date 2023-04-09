package class10;

public class GetElementsByAdvancedLoop {
	
	public static void main (String [] args) {
		 
		int [] numbers= {23,24,25,26,27};
		// we want to print the array all elements use the advanced or enhanced loop
		
		
		
		for (int arraynumber:numbers) {
			
			if (arraynumber%2!=0) {
				
				System.out.print(arraynumber+" ");
			}
			
		}
		
		
		System.out.println();
		String [] names = {"Aziz", "Farhad", "Mohibullah", "Mohammad Arif"};
		
		for (int i=0; i<names.length; i++) {
			
			System.out.print(names[i]+ "  ");
		}
		
		System.out.println();
		for (String a:names) {
			System.out.print(a+ " ");
		}
		
		
	}

}
