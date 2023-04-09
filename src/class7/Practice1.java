package class7;

public class Practice1 {
	public static void main(String[] args) {
		
		
		//Create a boolean variable workDay and assign true create int variable day and assign it to 1
		
		//As long as it is workDay print �I need a day off� and increase day.
		//Once day is 6 or 7 print �I do not need a day off any more�
		
		boolean workDay=true;
		int day= 1;
		
		while (workDay==true) {// if loop is false. it will stop
			
			System.out.println("I need  a day off");
			day++;
			
			if (day==6 || day==7) {// when we will get in to the if class? when the day value is 6 or 7
				
				System.out.println("I do not need day off");
				workDay=false;
			}
			
		}
		
		

	}

}
