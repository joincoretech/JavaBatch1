package class15.classDemo;

public class FirstClass {


    int num1=10;
    int num2=5;

    public void addTwoNumbers(){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {

        FirstClass addition= new FirstClass();

        addition.addTwoNumbers();// 15
    }

}
