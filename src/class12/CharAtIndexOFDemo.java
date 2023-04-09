package class12;

public class CharAtIndexOFDemo {
	
	
	public static void main(String []args) {
		
		
		String name1="khushal khan";
		
		System.out.println(name1.charAt(2));
		
		int num=0;
		
		for (int i=0; i<name1.length(); i++) {
			
			if (name1.charAt(i)== 'k') {
				
				num++;
			}		
		}
		
		System.out.print("we have "+num+ " k in the string");
		
		
		System.out.println();
		String day1="sunday";
		
		String resultString="";
		
		for(int i=day1.length()-1; i>=0 ; i--) {
			
			resultString+=day1.charAt(i);
		}
		
		System.out.print(resultString);
		
		
		System.out.println();
		String name2= "Nael Hassan";
		
		System.out.println(name2.indexOf('e'));
		
	}

}
