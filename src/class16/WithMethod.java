package class16;

public class WithMethod {

    public static void main(String[] args) {
        int num1=15;
        int num2=-20;
        int num3=0;
         checkNumbers(15);
         checkNumbers(num2);
         checkNumbers(num3);
    }


    public static void checkNumbers(int num){

        if (num>0){
            System.out.println("the number "+num+" is greater than zero ");
        }else if(num<0){
            System.out.println("The number "+ num+" is smaller than zero ");
        }else{
            System.out.println("The number "+num+" is zero ");
        }
    }
}
