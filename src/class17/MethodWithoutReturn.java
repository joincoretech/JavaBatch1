package class17;

public class MethodWithoutReturn {
    public static void main(String[] args) {
        MethodWithoutReturn obj= new MethodWithoutReturn();

        System.out.println(obj.add(10,10));
        System.out.println(obj.reversString("good"));
        obj.isRaning(false);
    }


    int add(int a, int b){
        int c;
        c=a+b;
        return c;
    }

    String reversString(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        str=stringBuilder.toString();
        return str;
    }

    void isRaning(boolean rain){
        if (rain){
            System.out.println("take you Umbrella with you");
        }else {
            System.out.println("you do not need Umbrella");
        }
    }
}
