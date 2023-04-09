package class10;

public class Arrays {
	public static void main (String [] args) {
		
		int num =10;
		 num=20;
		 System.out.println(num);
		 
		 int [] numbers= new int [5];
		 
		 numbers[0]= 5;
		 numbers[1]=10;
		 numbers[2]=15;
		 numbers[3]=25;
		 numbers[4]=30;
		 
		 System.out.println(numbers[4]);
		 
		 double [] num1=new double [3];
		 
		 num1[0]=10.11;
		 num1[1]=5.56;
		 num1[2]=60;
		 System.out.println("number3 "+num1[2]+ " number1 "+num1[0]+ " number2 "+ num1[1]);
		 
		 
		 String [] nameOfArray= new String [2];
		 
		 nameOfArray[0]=" Farhad";
		 nameOfArray[1]="Aziz";
		 System.out.println(nameOfArray[1] + nameOfArray[0]);
		 
		 
		 boolean [] b= new boolean[3];
		 
		 b[0]= true;
		 b[1]=false;
		 b[2]= true;
		 
		 System.out.println(b[1]);
		 
		 int size=b.length;
		 System.out.println("array size is "+size);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
