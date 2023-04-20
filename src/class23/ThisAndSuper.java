package class23;

public class ThisAndSuper {
     int num;
     ThisAndSuper(){
         System.out.println("i am the first constructor");
     }

      ThisAndSuper(int num){
        this();
        System.out.println("i am the second");
    }

    public static void main(String[] args) {
        ThisAndSuper obj=new ThisAndSuper(2);
    }
}
