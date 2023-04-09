package class14;

public class Tochararray {
	
	public static void main (String[]args) {
		
		String name1= "Joincore Thecnology";
		
		char [] array=name1.toCharArray();// array={'j','o',........}
		
		System.out.println(array.length);
		
		String name2="";
		
		for (char n:array) {
			
			if (n=='o') {
				
				name2+='A';
				continue;
			}
			
			name2+=n;
		}
		
		System.out.println(name2);
		
		
		for (int i=array.length-1; i>=0; i-- ) {
			
			System.out.print(array[i]);
		}
		
	}

}
