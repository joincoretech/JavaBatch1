package class25;

public class SuperKeyWord {

    String name="I am parent class";
    void printName(){
        System.out.println(name);
    }
}

class Child1 extends SuperKeyWord{

    String name="I am Child1";

    void printName(String name){
        System.out.println(name);// local variable will print out
        System.out.println(this.name);// I am Child1
        System.out.println(super.name);// I am parent class
    }
    void printName(){
        System.out.println(this.name);
    }
}
class Child3 extends Child1{

    @Override
    void printName() {
        this.printName("Child1");
        //this.printName();/// child1
        super.printName();// Super
    }

    public static void main(String[] args) {
        Child3 child3=new Child3();
        child3.printName();
    }
}

