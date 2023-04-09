package class12;

public class EqualString {
	public static void main(String[] args) {
		
		
		String s1="Hello";
		String s2= "Do not wary you will get job";
		String s3="hello";
		
		System.out.println(s1.equals(s3));// out put will be boolean true or false
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("the two string are same");
		}
	}

}
