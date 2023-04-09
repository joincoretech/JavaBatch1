package class3;

public class AdditionVsConcatenation {
	
	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 =  10;
		
		System.out.println(number1+number2);// 15
		
		String str1 = "hello";
		String str2 = "Hi";
		String str3 = "5";
		
		System.out.println(number1+number2+str1+str2);// 15helloHi
		System.out.println(number1+number2+str3+str1+str2);//155helloHi
		
		System.out.println(number1+(str1)+number2); //5hello10
	}

}
