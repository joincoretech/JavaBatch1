package class12;


public class StartWithDemo {
	public static void main(String[] args) {
		
		
		String thisIsStrring= "These methods are only for string objects";
		
		System.out.println(thisIsStrring.startsWith("These methods are"));// true
		
		if (thisIsStrring.startsWith("Those") || thisIsStrring.startsWith("These")){
			
			System.out.println("The Subject is plural");
		}else {
			
			System.out.println("The subject is singular");
		}
		
		// endsWith()
		System.out.println(thisIsStrring.endsWith("objects"));// true
		
		
	}

}
