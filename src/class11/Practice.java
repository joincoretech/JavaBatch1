package class11;

public class Practice {
	
	public static void main(String [] args) {
		
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).
		
		String [] names= new String[5];
		
		names[0]="Aziz";
		names[1]="Farhad";
		names[2]="Muzamel";
		names[3]="Nael";
		names[4]= "Noorullah";
		
		
		System.out.println(names[1]);
		 
		String [] names1= {"Arshad", "Muhibullah", "Mohammad Arif"};
		
		System.out.println(names1[2]);
		
		for(int i=0; i<names1.length; i++) {
			
			System.out.print(names1[i]+", ");
		}
		
		System.out.println();
		
		for(String n:names) {
			if (n=="Aziz") {
			System.out.print(n+", ");
			}
		}
		
		
	}

}
