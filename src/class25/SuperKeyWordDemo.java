package class25;

public class SuperKeyWordDemo {

    SuperKeyWordDemo(){
        System.out.println("I am with out parameter constructor");
    }
    SuperKeyWordDemo(String info){
        System.out.println("this is your info");
    }

}

class SuperKeyChild extends SuperKeyWordDemo{
    SuperKeyChild(){
        super();
    }

    public static void main(String[] args) {
        SuperKeyWordDemo obj=new SuperKeyChild();

    }
}