package class25;

final public class FinalClass {

    static String userName="yourUser";

    // this is compiled time error because we have the same name variable
    // String userName="Aziz";


}

/*
class B extends FinalClass { // we can not inherit the final class

}
*/
 class C {

     static void add(){
         System.out.println(10/2);

     }

    public static void main(String[] args) {
        add();
    }
}
