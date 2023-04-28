package class27;

public class StaticMethodDemo  implements I1, I3{
     public void method1(){
         I1.method1();
         I3.method1();
     }
}

interface I1{

    public static final String name="string";
    static void method1(){
        System.out.println(" this is interface 1");
    }
}

interface I3{
    static void method1(){
        System.out.println("this is interface 3");
    }
}