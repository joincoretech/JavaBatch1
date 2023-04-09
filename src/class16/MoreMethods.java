package class16;

public class MoreMethods {

    public void compareNumbers(int num, int num1){

        if (num>num1){
            System.out.println(num+ " is greater than "+num1);
        }else if (num1>num){
            System.out.println(num1+ " is greater than "+num);

        }else {
            System.out.println(num+ " is equal to "+num1);
        }
    }
// aba reverse aba
// adb    //  bda
    public void evenOrOdd(int num){
        if (num%2==0 && num!=0){
            System.out.println("the number is even");
        }else if (num%2!=0 ){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is zero");
        }
    }

}
