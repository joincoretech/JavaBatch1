package class19;

public class LocalVariables {


    public void addition(int num1, int num2){ // num1 and num2 are local var
        System.out.println(num1+num2);
    }


    public void sub(){
        // these are local var
        int num1=10;
        int num2=12;
        System.out.println(num1-num2);
    }

    String returnString(int num){
        return "this is string";
    }

    public static void main(String[] args) {
        LocalVariables localVariables=new LocalVariables();
        localVariables.addition(10,16);
        localVariables.sub();
        System.out.println(localVariables.returnString(1));
    }

}
