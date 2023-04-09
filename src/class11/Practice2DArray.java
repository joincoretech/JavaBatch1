package class11;


public class Practice2DArray {
	
	public static void main(String [] args) {
	
		
		// let add create to rows one row should has number string and second row should has fruit names;
		
		
		String [][] fruits= new String[2][3];
		 //row 1
		fruits[0][0]= "$5";
		fruits[0][1]= "$10";
		fruits[0][2]=  "$15";
		//row 2
		fruits[1][0] = "Apple";
		fruits[1][1] =  "Straberry";
		fruits[1][2] = "Orange";
		
		
		System.out.println(fruits[1][0]+ " "+ fruits[0][2]+ ". "+ fruits[1][1]+ " "+ fruits[0][0]);
		
		
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		String [][] grade= new String[2][4];
		
		grade[0][0]="Farhad";
		grade[0][1]="John";
		grade[0][2]="Smith";
		grade[0][3]="chris";
		grade[1][0]="A";
		grade[1][1]="B";
		grade[1][2]="C";
		grade[1][3]="D";
		
		
		System.out.println(grade[0][0]+ ": "+ grade[1][0]+ " "+ grade[0][3]+": "+grade[1][1]);
		
		
	
	}

}
