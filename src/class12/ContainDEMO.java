package class12;

public class ContainDEMO {

	public static void main(String[] args) {
		
		
		String password= "123abc#$%";
		
		System.out.println(password.contains("%"));//output true/false
		
		if (password.contains("%")) {
			
			System.out.println("Please remove % charactor is not allowed");
		}else {
			System.out.println("you have a strong password");
		}
		
		
	}
}
