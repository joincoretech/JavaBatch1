package class12;

public class TrimDemo {
	
	public static void main(String[]args) {
		
		
		String name1="                 Khushal";
		System.out.println(name1.trim());
		
		
		String demoTrimString=" this is trime demonstration    ";
		
		System.out.println(demoTrimString.trim());
		
		
		String password= "aziz432";
		
		if (password.length()<8) {
			
			System.out.println("Your password should be more than 8 charactors");
		}
	}

}
