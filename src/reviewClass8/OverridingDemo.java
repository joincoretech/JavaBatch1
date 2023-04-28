package reviewClass8;

public class OverridingDemo {

}
class A{

    private void method2(){
        System.out.println("this is private method");
    }

    void method1(){
        System.out.println("this is parent class");
    }
}

class B extends A{
    void method1(){
        System.out.println("this is child class");
    }

}