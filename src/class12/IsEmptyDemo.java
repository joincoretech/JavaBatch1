package class12;

public class IsEmptyDemo {
	public static void main(String[] args) {
		
		
		String userName="user";
		
		System.out.println(userName.isEmpty());// output boolean true/false
		
		
		if (userName.isEmpty()) {
			
			System.out.println("Please add userName the box should not be empty");
		} else {
			
			System.out.println("your useName is correct");
		}
		
		
		// conCat()  +
		
		String hello="Hello ";
		
		String name="My name is Arshad";
		
		System.out.println(hello+name);// this way is recommended
		
		System.out.println(hello.concat(name));
		
		
	}

}
