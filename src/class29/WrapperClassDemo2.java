package class29;

public class WrapperClassDemo2 {

    public static void main(String[] args) {
        int a=10;
        Integer aa=a; // auto boxing
        int b=aa; //unboxing

        Integer integer=new Integer(15);// this is the long way of boxing
        System.out.println(integer);
        Integer integer1=45;// this is the short way
        int abc=integer1.intValue();// longger way of unboxing
        abc=integer1;// short way of unboxing

    }
}
